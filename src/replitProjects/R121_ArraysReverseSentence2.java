package replitProjects;

import java.util.Arrays;

public class R121_ArraysReverseSentence2 {

    public static void main(String[] args) {
        String str = "Java is fun";

        String[] arr = str.split(" ");
        /*System.out.println(Arrays.toString(arr));*/
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i] + " ";
        }
        System.out.println(reversed);
    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */