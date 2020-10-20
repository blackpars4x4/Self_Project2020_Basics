package Dervis;

import java.util.Scanner;

public class Area_of_Eq_Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side of Triangle: ");

        Double a = scanner.nextDouble();

        Double Area = (Math.pow(a,2))*(Math.sqrt(3)/4);

        System.out.println("Area of Triangle is: " + Area);
    }
}
