package jetBrainPractice;

import java.util.Scanner;

public class IteratingOverArraysSumofArrElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {// or for(int i : array){
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
