package Dervis;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scanner.nextInt();

        int facts = 1;

        for(int i=1; i <= n ; i++){

            facts = facts * i;
        }

        System.out.println("Factorials of " + n + "! = " + facts );



    }
}
