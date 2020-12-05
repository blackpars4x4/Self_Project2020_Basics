package replitProjects;

import java.util.Scanner;

public class R155_Methods10_PrintNext3Numbers {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int a){
        System.out.println("next 3 are: \n"+ (a+1) + " " + (a+2) + " "+(a+3));
    }

}
/*
Create a method called next3 . This method gets an int argument and
prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */