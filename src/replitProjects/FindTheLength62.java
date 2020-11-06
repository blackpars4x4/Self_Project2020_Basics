package replitProjects;

import java.util.Scanner;

public class FindTheLength62 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter the text: ");

        String input = scan.nextLine();

        System.out.println("The string length is " + input.length());
    }
}
    /*Write a program that will output length of the text (string).

        Example:

        Display message: "Please enter the text:"

        input: java

        Display message: "Length is: 4"*/