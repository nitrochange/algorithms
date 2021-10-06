import java.util.Scanner;

/**
 * Задача на Java не заходила по памяти, хотя алгоритм был верный, написал реализацию на Go
 *
 * package main
 *
 * import (
 * 	"bufio"
 * 	"fmt"
 * 	"log"
 * 	"os"
 * 	"strconv"
 * 	"strings"
 * )
 *
 * func main() {
 * 	file, err := os.Open("input.txt")
 * 	if err != nil {
 * 		log.Fatal(err)
 *        }
 * 	defer file.Close()
 *
 * 	//scanner := bufio.NewScanner(os.Stdin)
 *
 * 	reader := bufio.NewReader(os.Stdin)
 * 	text, _ := reader.ReadString('\n')
 *
 * 	//for scanner.Scan() {
 * 	//	lines = append(lines, scanner.Text())
 * 	//}
 * 	var n, _ = strconv.Atoi(strings.Split(text, " ")[0])
 * 	var q, _ = strconv.Atoi(strings.Split(strings.Replace(text, "\n", "", -1), " ")[1])
 * 	var numbers = make([]int64, 0)
 * 	numbers = append(numbers, 0)
 * 	text, _ = reader.ReadString('\n')
 * 	var stringNumbers = strings.Split(strings.Replace(text, "\n", "", -1), " ")
 * 	for i := 1; i <= n; i++ {
 * 		var elem, _ = strconv.ParseInt(stringNumbers[i - 1], 10, 64)
 * 		numbers = append(numbers, numbers[i-1] + elem)
 *    }
 *
 * 	for i := 0; i < q; i++ {
 * 		text, _ = reader.ReadString('\n')
 * 		var leftBoarder, _ = strconv.Atoi(strings.Split(text, " ")[0])
 * 		var rigthBoarder, _ = strconv.Atoi(strings.Split(strings.Replace(text, "\n", "", -1), " ")[1])
 * 		fmt.Println(numbers[rigthBoarder] - numbers[leftBoarder - 1])
 *    }
 * }
 *
 */


public class Prefix_sums {
    public static void main(String[] args) {
        int n, q;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        long[] numbers = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt() + numbers[i-1];
        }

        sc.nextLine();
        String[] input;
        for (int i = 0; i < q; i++) {
            input = sc.nextLine().split(" ");
            int leftIndex = Integer.parseInt(input[0]) ;
            int rightIndex = Integer.parseInt(input[1]) ;
            System.out.println(numbers[rightIndex] - numbers[leftIndex - 1]);
        }
    }
}
