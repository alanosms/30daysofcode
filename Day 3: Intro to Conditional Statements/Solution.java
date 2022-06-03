import java.util.Scanner;
 
public class Solution {
    public static void main(String args[]) {
        int input;
        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        if (input < 1 && input > 100) //* INPUT RULE 
            return;
        if (input % 2 != 0) {
            System.out.println("Weird");
        } 
        else if (input > 2 && input < 5) {
            System.out.println("Not Weird");
        }
        else if (input > 6 && input <= 20) {
            System.out.println("Weird");
        }
        else if (input > 20) {
            System.out.println("Not Weird");
        }
    }
}
