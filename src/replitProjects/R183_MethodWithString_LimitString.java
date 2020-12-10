package replitProjects;

public class R183_MethodWithString_LimitString {
    public static void main(String[] args) {
        System.out.println(limit("abcd", 2));
    }
    public static String limit(String text, int maxLength) {
            String str = text.substring(0, 2);
            return str;
    }
}
/*
This method gets a string and an int, it returns a string.

what it dose is limit the inputted string to a cretin number of characters.

for example:

limit("abcd",2)
returns "ab"

limit("bla bla",3)
returns "bla"

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)

 */