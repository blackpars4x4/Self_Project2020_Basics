package replitProjects;

import java.util.Scanner;

public class AssessmentTest5_1_PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String str = "";
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    ||word.charAt(i) == 'u' || word.charAt(i) == 'o' ){
                System.out.print(word.charAt(i));
            }else{
                continue;
            }

        }


    }

}
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels.
Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */