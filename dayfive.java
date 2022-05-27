import java.util.Scanner;

public class dayfive{     
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int initialCount = 1; initialCount <= 10 ; initialCount++){
            int result = input * initialCount;
        System.out.println(""+input+" x "+initialCount+" = "+result+"");
        }
    }
}
