package replitProjects;

public class R186_Methods_RemoveFirstChar {
    public static void main(String[] args) {
        System.out.println(removeFirst("aaa"));
    }
    public static String removeFirst(String target) {

        String str = target.substring(1);

        return str;
    }

}
/*
The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"
 */