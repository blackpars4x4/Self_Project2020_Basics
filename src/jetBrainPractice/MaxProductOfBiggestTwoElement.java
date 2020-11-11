package jetBrainPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductOfBiggestTwoElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int multipyEnd = array[size - 1] * array[size - 2];
        int multipyStart = array[0] * array[1];
        if (multipyStart > multipyEnd) {
            System.out.println(multipyStart);
        } else {
            System.out.println(multipyEnd);
        }
    }
}
