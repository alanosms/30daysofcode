import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String input = scan.next();
        try{
            int parse = Integer.parseInt(input);
            System.out.println(parse);
        }
        catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}