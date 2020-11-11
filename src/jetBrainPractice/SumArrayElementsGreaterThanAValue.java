package jetBrainPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrayElementsGreaterThanAValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int n = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] > n) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
/*
Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
The third line contains the number n.

Output data format

Only a single number representing the sum.
 Report a typo
Sample Input 1:

5
5 8 11 2 10
8
Sample Output 1:

21
Sample Input 2:

4
-5 -4 -6 -11
-10
Sample Output 2:

-15
 */