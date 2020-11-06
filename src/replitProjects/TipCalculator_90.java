package replitProjects;

import java.util.Scanner;

public class TipCalculator_90 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Here is the service quality li: ");
        System.out.println("Poor = 5% \n"+ "Fair = 10% \n" + "Good = 15% \n" + "Great = 20% \n"+"Excellent = 25%");
*/
        double totalPay = 0;
        double tipAmount = 0;
        int numberOfPeople =0 ;

        System.out.println("The Check Amount: ");
        double checkAmount = scan.nextDouble();

        System.out.println("Would you like to Split or No Split? ");
        String split = scan.next().toLowerCase(); //yes or no

        if(split.equals("yes")) {
            while (split.equals("yes")) {
                System.out.println("Number of people entered: ");
                numberOfPeople = scan.nextInt();

                System.out.println("Service Quality: ");
                System.out.println("Poor = 5% \n" + "Fair = 10% \n" + "Good = 15% \n" + "Great = 20% \n" + "Excellent = 25%");
                String serviceQuality = scan.next().toLowerCase();

                switch (serviceQuality) {
                    case "poor":
                        tipAmount = checkAmount * 0.05;
                        totalPay += checkAmount + tipAmount;
                        break;
                    case "fair":
                        tipAmount = checkAmount * 0.1;
                        totalPay += checkAmount + tipAmount;
                        break;
                    case "good":
                        tipAmount = checkAmount * 0.15;
                        totalPay += checkAmount + tipAmount;
                        break;
                    case "great":
                        tipAmount = checkAmount * 0.2;
                        totalPay += checkAmount + tipAmount;
                        break;
                    case "excellent":
                        tipAmount = checkAmount * 0.25;
                        totalPay += checkAmount + tipAmount;
                        break;
                    default:
                        System.out.println("Invalid Service Quality");

                }
                System.out.println("Number of people entered: " + numberOfPeople);
                System.out.println("Total amount per Person: " + totalPay/numberOfPeople);
                System.out.println("Tip amount per Person: " + tipAmount/numberOfPeople);
                break;

            }
        }
        else if(split.equals("no")){

            System.out.println("Service Quality: ");
            System.out.println("Poor = 5% \n" + "Fair = 10% \n" + "Good = 15% \n" + "Great = 20% \n" + "Excellent = 25%");
            String serviceQuality = scan.next().toLowerCase();

            switch (serviceQuality) {
                case "poor":
                    tipAmount = checkAmount * 0.05;
                    totalPay += checkAmount + tipAmount;
                    break;
                case "fair":
                    tipAmount = checkAmount * 0.1;
                    totalPay += checkAmount + tipAmount;
                    break;
                case "good":
                    tipAmount = checkAmount * 0.15;
                    totalPay += checkAmount + tipAmount;
                    break;
                case "great":
                    tipAmount = checkAmount * 0.2;
                    totalPay += checkAmount + tipAmount;
                    break;
                case "excellent":
                    tipAmount = checkAmount * 0.25;
                    totalPay += checkAmount + tipAmount;
                    break;
                default:
                    System.out.println("Invalid Service Quality Entry");
            }
            System.out.println("The amount is calculating...");


        }
        else {
            System.out.println("Invalid Entry...!");
        }


        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip : " + tipAmount);


    }
}
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8


Input:

Split:Yes

Number of people:4

Check amount:476.0

Service Quality:Excellent


Output:
Number of people entered: &&&&

Total to pay: 595.0

Total tip: 119.0

Total per person: 148.75

Tip per person: 29.75
 */