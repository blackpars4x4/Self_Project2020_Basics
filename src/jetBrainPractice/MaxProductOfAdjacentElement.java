package jetBrainPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfAdjacentElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0] * array[1];

        for (int j = 1; j < size; j++) {
            if (array[j - 1] * array[j] >= max) {
                max = array[j - 1] * array[j];
            }
        }
        System.out.print(max);
    }

}
/*
Write a program that reads an array of ints and outputs the maximum product
of two adjacent elements in the given array of non-negative numbers.

Input data format

The first line of the input contains the number of elements in the array.

The second line contains the elements of the array separated by spaces.

The array always has at least two elements.

 Report a typo
Sample Input 1:

2
5 3
Sample Output 1:

15
Sample Input 2:

3
10 8 4
Sample Output 2:

80
 */