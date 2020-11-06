package replitProjects;

import java.util.Scanner;

public class TernaryOperator60 {//60-61

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int result;

        System.out.println("Enter the number: ");

        int x = scan.nextInt();

        result = (x >= 0) ? x : -x;

        System.out.println("Result: " + result);


        System.out.println("==================================================");



        System.out.println("Enter the number1: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the number2: ");
        int num2 = scan.nextInt();

        result = (num1 > num2) ? num1 : num2;

        System.out.println("The larger number is: " + result);

    }


}



   /* Statement1: Write an expression using the conditional operator (? :)
   that compares the value of the variable x to 5 and results in:

        Display x if x is greater than or equal to 5
        Display -x if x is less than 5

      Statement2: Write an expression using the conditional operator (? :) that compares the
    values of the variables num1 and num2. The result (that is the value)
    of this expression should be the value of the larger of the two variables.
    The larger value should be printed out.
*/
