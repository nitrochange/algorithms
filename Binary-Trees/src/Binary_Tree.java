
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


public class Binary_Tree {

    static boolean isAlready = false;

    private static TreeNode add(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (root.val == value) { isAlready = true; return root;}
        if (root.val > value) {
            root.left =  add(root.left, value);
        } else {
            root.right=  add(root.right, value);
        }
        return root;
    }

    private static String search(TreeNode root, int value) {
        if (root == null) {return "NO";}
        if (root.val == value) {return "YES";}
        if (root.val > value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    private static void print(TreeNode treeNode, int level) {
        if (treeNode == null) return;
        char[] chars = new char[level];
        Arrays.fill(chars, '.');
        String str = new String(chars);
        System.out.println(str + treeNode.val);
        print(treeNode.left, level + 1);
        print(treeNode.right, level + 1);
    }

    public static void main(String[] args) {
        List<String> input =new ArrayList<>();
        try {
            input = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);;

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        TreeNode tree = null;
        for (String line : input) {
            if (line.equals("PRINTTREE")) {
                print(tree, 0);
            } else if (line.startsWith("SEARCH")) {
                int findedValue = Integer.parseInt(line.split(" ")[1]);
                System.out.println(search(tree, findedValue));
            } else {
                int insertedValue = Integer.parseInt(line.split(" ")[1]);
                tree = add(tree, insertedValue);
                if (isAlready) {
                    System.out.println("ALREADY");
                } else {
                    System.out.println("DONE");
                }
                isAlready = false;
            }
        }
    }
}
