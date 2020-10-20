package Dervis;

import java.util.Scanner;

public class Area_of_Circle {

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double p = 3.14;
        double  area= p * Math.pow(r, 2) ;
        System.out.println("Area of Circle is: " + area);
    }
}
