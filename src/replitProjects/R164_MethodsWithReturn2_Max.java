package replitProjects;

import java.util.Scanner;

public class R164_MethodsWithReturn2_Max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int m = input.nextInt();
        System.out.println(max(x,m));

    }
    public static int max(int x,int  max){

        if(x < max){
            return max;
        }else {
            return x;
        }


    }
}
/*
max function gets two ints, x and max.
x is the test case, max is what we test against.

if  x is bigger then max return max
in any other case return x.

 */