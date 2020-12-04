package replitProjects;

import java.util.Scanner;

public class R148_Methods3_FindCube {

    public static void cube(int a){

        System.out.println("result: "+a*a*a);
    }


    //end cube

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        cube(input.nextInt());

    }


}
/*
create a method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */