package Dervis;

import java.util.Scanner;

public class DownwardTriangle {
    public static void main(String[] args) {
        System.out.println("Enter row number: ");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j;

        for(i=0; i<=n-1; i++){//#nuber of row (new line) defined with this for loop

            for(j=n; j>i; j--){ // number of
                System.out.print("* ");
            }
            System.out.println();

        }
        for(i=1; i<n+1; i++){

            for(j=0; j<i; j++){

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
