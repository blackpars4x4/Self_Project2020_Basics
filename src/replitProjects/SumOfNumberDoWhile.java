package replitProjects;

import java.util.Scanner;

public class SumOfNumberDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.println("Enter a number to sum: ");
            num = scan.nextInt();
            sum += num;
            System.out.println(sum);
        }
        while(num > 0);
        System.out.println("Sum of Number: ");
    }
}
