package replitProjects;

public class R191_MethodsWithString_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("students"));
    }
    public static String reverse(String input){
        String result = "";
        for (int i=input.length()-1; i>=0; i--){
            result += input.toCharArray()[i];
        }
        return result;
    }
}
