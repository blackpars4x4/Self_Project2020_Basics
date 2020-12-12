package replitProjects;

import java.util.ArrayList;

public class R193_MethodswithArrayList_CombineArrays {
    public static void main(String[] args) {
        String[] a = {"f","o","o"};
        String[] b = {" b","a","r"};
        System.out.println(combineRs(a,b));
    }

    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> combines = new ArrayList<String>();
        for (String each : r1){
            combines.add(each);
        }for(String each : r2){
            combines.add(each);
        }

        String result = combines.toString().replace(", ", "" )
                .replace("[", "").replace("]","");


        return result;
    }
}
/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */