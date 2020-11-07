package replitProjects;

import java.util.Arrays;

public class ArraysFindNonDuplicate_122 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 4, 3, 4};
        System.out.println(Arrays.toString(nums));
        for(int each : nums){
            int count = 0;
            for(int i = 0; i <=nums.length-1; i++){
                if(each == nums[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Non Duplicate number is: " + each);
            }

        }


    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]

         2
 */