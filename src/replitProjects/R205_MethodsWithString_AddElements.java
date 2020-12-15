package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R205_MethodsWithString_AddElements {
    public static void main(String[] args) {
        int[] a = {10, 40, 50, 3, 1};
        int[] b = {11, 0, 500, 44, 1101};
        System.out.println(Arrays.toString(addElements(a, b)));
    }

    public static int[] addElements(int[] ints1, int[] ints2) {
        int[] array = new int[ints1.length];

        for (int i = 0; i < ints1.length; i++) {
            array[i] = (ints1[i] + ints2[i]);
        }

        return array;
    }
}
