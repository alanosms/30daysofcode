import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        int numberOfElements;
        int numberOfSwaps = 0;
        Scanner scan = new Scanner(System.in);

        numberOfElements = scan.nextInt();

        int Array[] = new int[numberOfElements];

        for (int initialCount = 0; initialCount < numberOfElements; initialCount++) {
            Array[initialCount] = scan.nextInt();
        }

        for (int initialCount = 0; initialCount < numberOfElements; initialCount++) {

            for (int j = 0; j < numberOfElements - 1; j++) {
                if (Array[j] > Array[j + 1]) {

                    int positionToSwap = j;
                    int aux = Array[positionToSwap];

                    Array[positionToSwap] = Array[positionToSwap + 1];
                    Array[positionToSwap + 1] = aux;

                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+Array[0]);
        System.out.println("Last Element: "+Array[Array.length-1]);
    }
}
