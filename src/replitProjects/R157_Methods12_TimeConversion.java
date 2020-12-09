package replitProjects;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class R157_Methods12_TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
       String[] hours = s.split(":");

       if(hours[2].substring(2).equalsIgnoreCase("AM")){
           s = s.replaceFirst("AM", "");
           System.out.println(s);
       }else if(hours[2].substring(2).equalsIgnoreCase("PM")){
           int h2 = Integer.parseInt(s.substring(0, s.indexOf(":")));
           int h = h2 + 12;
           if(h2>=10){
               if(h<24){
                   s=s.replaceFirst(s.substring(0,2),"");
                   s=s.replaceFirst("PM","");
                   System.out.println(h+s);
               }else{
                   h=0;
                   s=s.replaceFirst(s.substring(0,2),"");
                   s=s.replaceFirst("PM","");
                   System.out.println("00"+s);
               }
           }else {
               if (s.startsWith("0")){
                   s = s.replaceFirst(s.substring(0, 2), "");
                   s = s.replaceFirst("PM", "");
                   System.out.println(h + s);
               }else {
                   s = s.replaceFirst(s.substring(0, 1), "");
                   s = s.replaceFirst("PM", "");
                   System.out.println(h + s);
               }
           }
       }
    }
}


/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):

s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
