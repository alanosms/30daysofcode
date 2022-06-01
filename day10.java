import java.util.Scanner;


public class Solution {
    public static void main(String args[]){
        int counter = 0, maxOne = 0;
        int n, aux;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        aux = n;
        String auxString = "";
        while (n>0){
            aux = n % 2;
            if(aux == 1){
                counter++;
                if (counter > maxOne){
                    maxOne = counter;
                }
            } else {
                counter = 0;
            }
        auxString = aux + auxString;
        n = n / 2;
        }
        System.out.println(maxOne);
    }
    
}
