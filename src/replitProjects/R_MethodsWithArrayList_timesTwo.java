package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R_MethodsWithArrayList_timesTwo {public static void main(String[] args) {

    ArrayList<Integer > nums=new ArrayList<>(Arrays.asList(1,2,3,4,5));

    timesTwo(nums);
}
    public static void  timesTwo(ArrayList<Integer > list1){

        for (int i=0;i<list1.size();i++){
            list1.set(i,list1.get(i)*2);
        }
        System.out.println(list1);

    }

}
