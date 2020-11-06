package replitProjects;

import java.util.Arrays;

public class ArrayFindMaxLengthInString_115 {

    public static void main(String[] args) {

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};

        int lengthOfWord[] = new int[words.length];

        for (int j = 0; j <= words.length - 1; j++) {
            String ch = words[j];
            int count = 0;
            for (int i = 0; i <= ch.length() - 1; i++) {
                count++;

            }
            lengthOfWord[j] = count;

        }
        System.out.println(Arrays.toString(lengthOfWord));

        int max = lengthOfWord[0];
        int k = 0;
        for (int i = 0; i <= lengthOfWord.length - 1; i++) {
            if (lengthOfWord[i] > max) {
                max = lengthOfWord[i];
                String longWord = words[i];
                k = i;
            }

        }
        System.out.println("The longest word is: " + words[k] +"\n"+ "Its lenght is : " + max);
    }
}
/*
Given the array words, it will print the word with the largest length.
Assume that there are no 2 words with longest length
Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */