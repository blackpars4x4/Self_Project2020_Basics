package replitProjects;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class AssessmentTest4_1_IsSorted {

    public static void main(String[] args) {
        int[] arr = {1,5,3};
        System.out.println(isSort(arr));

    }
    public static boolean isSort(int[] nums) {



         int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        /*for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }*/
         Arrays.sort(temp);

         if(nums == temp){
             return true;
         }else{
             return false;
         }

    }
}
/*
this is a sorted collection (in this case array):

7,8,9,10

this is an unsorted collection:

5,4,9,8,7,3

sorted in this case means smallest number to biggest.
you will not do sorting in this assignment.
you will only check if an array is sorted.

isSort gets an array and returns true if its sorted.

for example:
isSort([2,3,5,4,9]);
returns: false

isSort([1,2,3]);
returns: true

isSort([7,8,9]);
returns: true.

hint:when you loop the array if current number in the array is greater then next number,
array is not sorted return false.
 */