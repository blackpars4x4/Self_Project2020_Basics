package replitProjects;

import java.util.Arrays;
import java.util.Scanner;

public class R130_Arrays_ShiftLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        if (size == 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            int[] newArr = new int[size];
            for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
                newArr[i] = arr[j];
                if (j == newArr.length - 1) {
                    newArr[j] = arr[0];
                }
            }
            System.out.println(Arrays.toString(newArr));
        }
    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.

Example:
input: 6, 2, 5, 3
output: [2, 5, 3, 6]
 */