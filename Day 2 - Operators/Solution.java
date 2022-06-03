import java.io.*;
import java.util.Scanner;

public class Solution{
    public static void main(String args[]) {
        double meal_cost;
        int tip_percent, tax_percent;
        Scanner scan = new Scanner(System.in);
        
        meal_cost = scan.nextDouble();
        tip_percent = scan.nextInt();
        tax_percent = scan.nextInt();
        
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;

        double total = meal_cost + tip + tax;
        int totalCost = (int) Math.round(total);
        System.out.println(totalCost);
    }
}

