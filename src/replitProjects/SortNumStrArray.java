package replitProjects;

import java.util.Arrays;

public class SortNumStrArray {

    public static void main(String[] args) {


        int[] arr1 = {-2567, 5600, 322, 1200, 5467};
        String[] arr2 = {"Emre", "Dervis", "Burak", "uludag"};


        System.out.println("Original Numeric Array : " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Numeric Array Sorting: " + Arrays.toString(arr1));

        System.out.println("Original String Array: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("String Array Sorting: " + Arrays.toString(arr2));

    }

}
