package replitProjects;

import java.util.Scanner;

public class R166_MethodsWithReturn4_ProfitAndLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(c_profits(sc.nextInt(),sc.nextInt()));


    }
    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here
        if(buyPrice < sellPrice){
            return "profit";
        }else if(buyPrice == sellPrice){
            return "no loss";
        }else{
            return "loss";
        }


    }

}
/*
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
 */