package replitProjects;

import java.util.Scanner;

/*
create a function that can print out the maximum number from any given integer array
 */

public class MaxNumberInAnArray {
    public static void main(String[] args) {


        int[] array = {10, 2, 3, 6, 9, 25};

        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }

        }
        System.out.println(max);
    }
}
