package replitProjects;

import java.util.Arrays;

public class R178_MethodsWithString_MergeThem {
    public static void main(String[] args) {
        String s1 = "12345678";
        String s2 = "abcde";
        System.out.println(mergeStrings(s1, s2));
    }

    public static String mergeStrings(String one, String two) {
        String result="";
        int i = 0;
        int j = 0;
        while (true) {

            if (one.length() < two.length()) {
                if (i < one.length()) {
                    result += one.charAt(i);
                } else {
                    result += "";
                }
                if (j < two.length()) {
                    result += two.charAt(j);
                } else {
                    break;
                }
                i++;
                j++;
            }else {

                if (i < one.length()) {
                    result += one.charAt(i);
                } else {
                    break;
                }
                if (j < two.length()) {
                    result += two.charAt(j);
                }else {
                    result += "";
                }
                i++;
                j++;
            }
        }
        return result;


    }
}
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */