package replitProjects;

public class R185_MethodsWithString_BiggerString {
    public static void main(String[] args) {
        System.out.println(biggerS("apple", "orange"));
    }
    public static String biggerS(String a, String b) {

        if(a.length() > b.length()){
            return a;
        }else{
            return b;
        }
    }
}
/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */