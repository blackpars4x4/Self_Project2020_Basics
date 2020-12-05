package replitProjects;

import java.util.Scanner;

public class R154_Methods9_isPos {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        for(int num : arr){
            isPos(num);
        }

    }

    public static void isPos(int num)
    {
        //#1 your code here
        if(num > 0){
            System.out.println("positive");
        }else if(num < 0){
            System.out.println("not positive");
        }


    }


}
/*
isPos is a method that checks if  an int positive or not positive

1. If  the int num is positive print positive else print not positive

2. Complete main method by calling isPos method for each element in the array arr.

 */
