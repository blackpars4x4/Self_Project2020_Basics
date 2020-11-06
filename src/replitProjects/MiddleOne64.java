package replitProjects;

import java.util.Scanner;

public class MiddleOne64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");

        String word = scan.nextLine();

        if((word.length()%2 != 0)){
                if((word.length() >= 3)) {
                    int charc = (word.length() + 1) / 2;
                    char midLetter = word.charAt(charc - 1);

                    System.out.println(midLetter);
                }
                if((word.length() == 1)){
                    for(int i = 0; i < 3; i++) {
                        System.out.print(word);
                    }
                    System.out.println();
                }
        }
        else{
            if((word.length() >= 4)){
                int charc = (word.length()/2);
                String midLetter = word.substring((charc-1), (charc+1));
                /*char midLetter1 = word.charAt(charc-1);
                char midLetter2 = word.charAt(charc);*/
                System.out.println(midLetter);
            }
            if((word.length() == 2)){
                for(int i = 0; i < 2; i++){
                    System.out.print(word);
                }
                System.out.println();
            }
        }
            System.out.println("==========================================================");





    }
}
   /* You have a word, do the following:

        1. When word has odd number of characters and:
        - 3 or more characters, print middle letter

        oak ==> a

        javav ==> v

        - Single character, print that character 3 times

        # ==> ###

        q ==> qqq


        2. When word has even number of characters and:
        - 4 or more characters, print middle 2

        java ==> av

        apples ==> pl

        #$%^&* ==> %^

        - 2 characters, print those 2 characters twice

        @@ ==>@@@@

        $$ ==>$$$$

        hi ==> hihi*/