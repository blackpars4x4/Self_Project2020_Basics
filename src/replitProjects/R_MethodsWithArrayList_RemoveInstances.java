package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R_MethodsWithArrayList_RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        r.removeAll(Collections.singleton(n));
        return r;

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1, 1, 2, 3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }//end main
}
