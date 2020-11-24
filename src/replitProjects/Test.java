package replitProjects;

import java.util.Scanner;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

/*
nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
 */

        int count=0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 5) {
                count++;
                if (nums[i + 1] == 5) {
                    System.out.println(true);
                    count++;
                }
                for (int j = i + 2; j < 5; j++) {
                    if (nums[j] == 5) {
                        count++;
                        System.out.println(false);
                    }
                }
            }
        }

        if (count==0){
            System.out.println(false);
        }

    }
}
