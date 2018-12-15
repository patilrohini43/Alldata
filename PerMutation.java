package all.program.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerMutation {

    public static Set<String> permutationFinder(String str) {
        Set<String> sa = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            sa.add("");
            return sa;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                sa.add(charInsert(strNew, initial, i));
            }
        }
        return sa;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String You Want:-");
    	String s=sc.nextLine();      
    	
        System.out.println("\n Permutations for " + s + " are: \n" + permutationFinder(s));
       
    }
}
