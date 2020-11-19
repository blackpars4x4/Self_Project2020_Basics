package replitProjects;

public class R116_ArrayCountOfEvenNumber {
    public static void main(String[] args) {

       int[] arr = {1, 1,21,21,25,13, 17, 29, 11,3} ;

        int count = 0;

       for(int i = 0; i <= arr.length-1;i++){
           int eachNum = arr[i];

           if(eachNum % 2 == 0){
               count++;
           }
       }
        System.out.println("Count of Even number: " + count);
    }
}
    /*
    Given an array nums, calculate the count of even numbers in nums and print out to console.

    nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
    nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
    nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
     */