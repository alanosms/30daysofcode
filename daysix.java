import java.util.Scanner;

public class daysix {
    public static void main(String args[]) {
        int numberOfCases;
        Scanner scan = new Scanner(System.in);

        numberOfCases = scan.nextInt();

        for (int initialCount = 0; initialCount < numberOfCases; initialCount++) {
            String word = scan.next();
            char[] charArray = word.toCharArray();
            for (int auxCount = 0; auxCount < charArray.length; auxCount++) {
                if (auxCount % 2 != 1) {
                    System.out.print(charArray[auxCount]);
                }
            }
            System.out.print(" ");
            for (int auxCount = 0; auxCount < charArray.length; auxCount++) {
                if (auxCount % 2 != 0){
                    System.out.print(charArray[auxCount]);
                }
            }
            System.out.println();

        }
    }
}
