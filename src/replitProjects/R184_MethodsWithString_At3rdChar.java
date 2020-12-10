package replitProjects;

public class R184_MethodsWithString_At3rdChar {
    public static void main(String[] args) {
        System.out.println(at3("longword", "foo"));
    }

    public static String at3(String target, String word) {
        String str = "";
        for (int i =0; i < target.length(); i++){
            if(i == 3){
                str += word;
            }
            str += target.charAt(i);
        }
        return str;
    }
}
/*
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
 */