package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R_MethodsWithArrayList_AppendPosSum {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-3, 5, -8, 0, -7, 4, -2, 5));

        System.out.println(appendPosSum(nums));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {

        ArrayList<Integer> posList = new ArrayList<>(nums);
        posList.removeIf(p -> p <= 0);
        int sum = 0;

        for(int each : posList){
            sum += each;
        }
        posList.add(sum);
        return posList;


    }
}
/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
  The original ArrayList should remain unchanged.
 */