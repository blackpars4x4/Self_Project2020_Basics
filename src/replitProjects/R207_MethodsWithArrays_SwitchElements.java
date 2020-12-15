package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R207_MethodsWithArrays_SwitchElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(do_switch(array)));
    }

    public static int[] do_switch(int[] i) {

        int first = i[0];
        int last = i[i.length-1];

        i[0] = last;
        i[i.length-1] = first;

        return i;
    }
}
