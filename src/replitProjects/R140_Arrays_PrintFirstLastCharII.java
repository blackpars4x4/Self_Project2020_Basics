package replitProjects;

import java.util.Arrays;
import java.util.Scanner;

public class R140_Arrays_PrintFirstLastCharII {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] array = new String[words.length];

        for(int i = 0; i < words.length; i++){

            array[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
        }

        System.out.println(Arrays.toString(array));
        //TODO: Write your code below

    }
}
/*
Given a String array words, iterate through each word and
print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy,
 */