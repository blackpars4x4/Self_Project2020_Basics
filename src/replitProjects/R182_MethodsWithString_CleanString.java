package replitProjects;

import java.util.Scanner;

public class R182_MethodsWithString_CleanString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(clean(a, b));
    }

    public static String clean(String text, String badWord) {
        if (text.contains(badWord)) {
            String temp = " " + badWord;
            text = text.replaceAll(temp, "");

            temp = badWord + " ";
            text = text.replaceAll(temp, "");

            /*if (text.endsWith(badWord)) {
                String temp = " " + badWord;
                text = text.replaceAll(temp, "");
            }else if(text.startsWith(badWord)){
                String temp = badWord + " ";
                text = text.replaceAll(temp, "");
            }*/
        }
        return text;
    }

}
/*
This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)
 */