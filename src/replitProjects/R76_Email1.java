package replitProjects;

import java.util.Scanner;

public class R76_Email1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email = scan.nextLine();

        if(email.contains("_")){

            String name = email.substring(0, email.indexOf('_'));
            String lastname = email.substring(email.indexOf('_')+1, email.indexOf('@'));
            System.out.println(lastname + "_" + name + email.substring(email.indexOf('@')));
        }

        else{

            System.out.println(email);
        }


    }
}
/*
In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

        Example:

        input: mike_tyson@gmail.com

        output: tyson_mike@gmail.com


        Example:

        input: barakobama@gmail.com
        output: barakobama@gmail.com
*/
