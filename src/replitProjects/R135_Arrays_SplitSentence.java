package replitProjects;

import java.util.Scanner;

public class R135_Arrays_SplitSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

        String[] n = sentence.split(" ");

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

    }
}
/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun

 */