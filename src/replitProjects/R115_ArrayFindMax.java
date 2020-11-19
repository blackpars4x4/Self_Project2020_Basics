package replitProjects;

public class R115_ArrayFindMax {
    public static void main(String[] args) {

        int[] arr = {2,4,2,3,-2};


        int max = arr[0];

        for(int i = 0; i <=arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];

            }
        }

        System.out.print("Max Number: "+ max);

    }

}
/*
Given an array num, get the max number in nums and print out to console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33



hint:
create a variable called max and before you start searching assume the first item value is the max.
loop through each and every item and check for whether the value max is less than the item value.
if so assign the value to the max to overwrite existing max.
you will get the max value when you are done with the loop
 */