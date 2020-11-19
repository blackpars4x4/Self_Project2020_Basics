package replitProjects;

import java.util.Scanner;

public class R119_ArraySplitEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        String emailId;
        String Domain;


        if(email.contains("@")){
            String[] arr = email.split("@");
            if(arr.length == 2){
                System.out.println("Email Id: " + arr[0]);
                System.out.println("Domain: " + arr[1]);
            }else{
                System.out.println("Invalid Email!!!");
            }

        }else{
            System.out.println("Invalid email");
        }

    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com

If email contains no @ character or multiple @ characters then print invalid email:
email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */