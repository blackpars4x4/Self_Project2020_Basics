package jetBrainPractice;

import java.util.Scanner;

public class CheckIfAnArrayIsSortedAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }

        }
        if (count == arr.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
