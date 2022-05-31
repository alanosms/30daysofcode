import java.util.Scanner;

public class Solution {

    public static int factorial(int num) {

        if (num <= 1) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(factorial(input));
    }
}
