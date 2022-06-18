import java.io.*;
import java.util.*;

public class Solution {
    private static boolean isPrime(int number){
        if (number == 1) return false;
        
        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                return false;
            }
        }
            return true;
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberTimes = scan.nextInt();
        
        while(numberTimes-->0){
                if (isPrime(scan.nextInt())){                    
                System.out.println("Prime");
                }
            else
                System.out.println("Not prime");
            }
        }
        
    }

