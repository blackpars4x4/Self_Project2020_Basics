package Dervis;

import java.util.Scanner;

public class Diamond {


    public static void main(String[] args) {

        int n, i, j, space;
        System.out.println("Enter number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n-1;
        for(j=1; j<=n; j++) {
            for (i = 0; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;

            for (i = 0; i <= 2 * (j - 1); i++)
            {
                System.out.print("*");
            }
            System.out.println("");
            }
            space = 1;

        for(j = 1; j <= n-1; j++)
            {
            for(i=0; i<=space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for(i=0; i<=2*(n-j)-2; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
