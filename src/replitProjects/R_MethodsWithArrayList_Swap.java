package replitProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R_MethodsWithArrayList_Swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        Collections.swap(list, pos1,pos2);
        return list;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f"));
        System.out.println(swap(list, 0, 2));
    }//end main


}
