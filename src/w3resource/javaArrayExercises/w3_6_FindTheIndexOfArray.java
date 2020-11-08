package w3resource.javaArrayExercises;

import java.util.Scanner;

public class w3_6_FindTheIndexOfArray {

    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int[] my_array = {250, 300, 100, 1000, 900};*/

        System.out.println("Enter the element: ");
        int element = scan.nextInt();
/*
        for(int i = 0; i <= arr.length-1; i++){
            if(element == arr[i]){
                System.out.println("Index of the element: " + i);
            }else{
                System.out.println("The element couldn't find...");
            }
        }*/

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of the element is: " + findIndex(my_array, element));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));

    }
}
/*
6. Write a Java program to find the index of an array element.
 */