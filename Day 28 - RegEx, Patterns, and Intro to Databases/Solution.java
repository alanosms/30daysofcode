import java.util.*;
import java.util.regex.*;


public class Solution {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String Regrex=".+@gmail\\.com$";
        
        List<String> names = new ArrayList();
        Pattern pattern=Pattern.compile(Regrex);
        
        while (n-->0){
            String firstName = scan.next();
            String emailID = scan.next();
            
            Matcher match=pattern.matcher(emailID);
            if (match.find()){
                names.add(firstName);
            }
        }
            Collections.sort(names);
            for(String name: names){
                System.out.println(name);
            }
        }
    }

