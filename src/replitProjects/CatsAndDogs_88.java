package replitProjects;

import java.util.Scanner;

public class CatsAndDogs_88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfDogs = 0;
        int countOfCats = 0;

        String word = scan.next();

        String word2 = word;
        String word3 = word;

        if (word.contains("cat")||word.contains("dog")) {
            while (word2.contains("cat")) {

                countOfCats++;
                word2 = word2.replaceFirst("cat", "");

            }
            while (word3.contains("dog")) {

                countOfDogs++;
                word3 = word3.replaceFirst("dog", "");


            }
            if (countOfCats == countOfDogs) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog

output: true


Example:

input: catcat

output: false


Example:

input: cat-cheetah-dog-cat

output: false
 */
