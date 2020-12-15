package replitProjects;

import java.util.Arrays;

public class R208_MethodsWithArrays_PopulateArray {
    public static int[] populate(int[] r)
    {
        //write your codes here
        for(int i = 0; i < r.length; i++){
            r[i] = i+1;

        }
        return r;
    }

    public static void main(String[] args)
    {


        int [] i= new int[5];
        i= populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
