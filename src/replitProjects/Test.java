package replitProjects;

import java.util.Scanner;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(clean(a, b));
    }

    public static String clean(String text, String badWord) {

        String[] str = text.split(" ");
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(str));
        arrayList.removeAll(Collections.singleton(badWord));
        System.out.println(arrayList);
        String newText = "";
        for(String each : arrayList){
            newText += each+" ";
        }

        return newText;
    }

}
