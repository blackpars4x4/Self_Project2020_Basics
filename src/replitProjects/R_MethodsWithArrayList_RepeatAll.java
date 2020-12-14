package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;

public class R_MethodsWithArrayList_RepeatAll {
    public static void main(String[] args) {

        ArrayList<Boolean> list=new ArrayList<>(Arrays.asList(false,true,true));

        repeatAL(list);
    }

    public static void repeatAL(ArrayList<Boolean> str){
        ArrayList<Boolean> list = new ArrayList<>(str);

        list.addAll(str);
        System.out.println(list);
    }
}
