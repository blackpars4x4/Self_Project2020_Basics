package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R_MethodsWithArrayList_2Times {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(nums));
    }

    //create your method below
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {
            ArrayList<Integer> result = new ArrayList<>();

        for (int each : list) {
            result.add(each);
            result.add(each);
        }
        return result;
    }

}
