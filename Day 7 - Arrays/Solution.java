import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numberOfCases = scan.nextInt();
        int[] myArray;
        myArray = new int[numberOfCases]; 
        for(int initialCount = 0; initialCount < numberOfCases; initialCount++){
            myArray[initialCount] = scan.nextInt();

        }
        int length = myArray.length - 1;
        for(int initialCount = length; initialCount > -1; initialCount--){
            System.out.print(myArray[initialCount]);
            System.out.print(" ");
        }
}
}
