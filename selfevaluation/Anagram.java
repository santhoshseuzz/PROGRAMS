package selfevaluation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1="Listen";
        String string2="Silent";
        boolean result=false;
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();
        char [] ch1=string1.toCharArray();
        System.out.println(Arrays.toString(ch1));
       // String e = String.valueOf(ch1);
       // System.out.println(e);
        char [] ch2=string2.toCharArray();
        if(ch1.length==ch2.length) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            result=Arrays.equals(ch1, ch2);
            if(result) {
                System.out.println(" Anagram");
            }
            else {
                System.out.println("It's not a Anagram");
            }
        }else {
            System.out.println("It's not a Anagram");
        }
    }
}
