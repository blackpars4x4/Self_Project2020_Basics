package jetBrainPractice;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class DifferenceOfTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int sec1 = scanner.nextInt();
        int num1 = hour1 * 3600 + min1 * 60 + sec1;

        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int sec2 = scanner.nextInt();
        int num2 = hour2 * 3600 + min2 * 60 + sec2;

        System.out.println(abs(num1 - num2));
    }
}
