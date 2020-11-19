package replitProjects;

import java.util.Scanner;

public class R79_WithoutX_x {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        String firstChar = word.substring(0, 1);
        String lastChar = word.substring(word.length()-1);

        if (firstChar.equalsIgnoreCase("x") && lastChar.equalsIgnoreCase("x")){


            String newWord = word.substring(1, word.length()-1);

            System.out.println(newWord);

        }
        else if (firstChar.equalsIgnoreCase("x")){

            System.out.println(word.substring(1, word.length()));
        }
        else if (lastChar.equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        }
        else{
            System.out.println(word);
        }

    }
}


/*
Instructions from your teacher:
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:

input: xHiX

output: Hi


Example:
input: apple

output: apple


input: xUxL

output: UxL


input: JavaX

output: Java
 */