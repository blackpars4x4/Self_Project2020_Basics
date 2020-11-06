package replitProjects;

public class ArraysFindSum_115 {

    public static void main(String[] args) {

        int num[] = {2, 1, 2, 3, 4};
        int sum = 0;

        for(int eachNum : num){

            sum += eachNum;
        }
        System.out.println(sum);

    }
}
/*
Given an array num, calculate the sum of all numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 12
nums → [2, 2, 0, 3, 5]) → 12
nums → [1, 3, 5, 7, 9]) → 25
 */