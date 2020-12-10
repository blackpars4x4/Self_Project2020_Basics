package replitProjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class R176_Methods_SimpleRoomBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(simpleRoomBook(true, 7, 2, 2018));
    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        if(year == 2018){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate start = LocalDate.of(2018,7,1);
            LocalDate finish = LocalDate.of(2018,7,8);
            LocalDate date = LocalDate.of(year, month, day);

            String str = start.format(dtf);
            System.out.println(finish.format(dtf));
            System.out.println(date.format(dtf));

            if(isAvailable == true){
                if(date.isBefore(start) || date.isAfter(finish)){
                    return true;
                }else{
                 return false;
                }
            }else{
                return false;
            }
        }else{
              return false;
    }

    }
}
/*
To book  a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false
 */