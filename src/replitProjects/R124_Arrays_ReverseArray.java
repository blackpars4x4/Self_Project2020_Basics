package replitProjects;

import java.util.Arrays;
import java.util.Scanner;

public class R124_Arrays_ReverseArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] nums = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        int[] arrays = new int[nums.length];

        for (int i = nums.length-1, j=0; i >=0; i--, j++){
            arrays[i] = nums[j];
        }
        System.out.println(Arrays.toString(arrays));
    }
}
/*
Given an array nums with 7 integers already assigned, write code to reverse it.
Do not use any additional arrays or Strings.

Example:

nums -> [4, 3, 2, 44, 1, 100, 55]
change it to:
nums -> [55, 100, 1, 44, 2, 3, 4]

PseudoCode:

1. Take values at index 0 and last index and swap them
2. Take values at index 0+1 and last index-1 and swap them
3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:
Example:

int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;
 */