package replitProjects;

import java.util.Scanner;


public class R146_Methods1_SimpleCalculator {

    public static void main(String[] args) {

        plus();
    }

    public static void plus(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println(result);
        //your code here


    }



}
/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */