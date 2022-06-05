import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;
    public int aux;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        for (int initialCount = 0; initialCount < elements.length - 1; initialCount++) {
            for (int auxCount = 1; auxCount < elements.length; auxCount++) {

                if (elements[initialCount] > elements[auxCount]) {
                    aux = elements[initialCount] - elements[auxCount];
                } else if (elements[initialCount] == elements[auxCount]) {
                    aux = 0;
                } else {
                    aux = elements[auxCount] - elements[initialCount];
                }
                if (aux > maximumDifference) {
                    maximumDifference = aux;
                }
            }
        }
        return maximumDifference;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}