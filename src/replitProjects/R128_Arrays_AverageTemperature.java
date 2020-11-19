package replitProjects;

import java.util.Scanner;

public class R128_Arrays_AverageTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = {80, 88, 88, 84, 82, 78, 60, 60};

        double total = 0;
       /* int k = 0;*/
        double avgTemp = 0;

        for(double each : temps){
            total += each;
        }
        avgTemp = total / temps.length;
        System.out.println(avgTemp);

    }

}
/*
Given an array temps of doubles, containing temperature data, compute the average temperature.

Store the average in a variable called avgTemp.

Besides temps and avgTemp, you may use only two other variables
-- an int variable k and a double variable named total, which have been declared.

Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
 */