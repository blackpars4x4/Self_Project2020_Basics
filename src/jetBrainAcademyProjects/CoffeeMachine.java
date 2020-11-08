package jetBrainAcademyProjects;

import java.util.Scanner;

public class CoffeeMachine {


    public static void startingCoffeeMachine() {

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");

    }

    static void calculateAmountOfIngridents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();

        System.out.println("For " + cupsOfCoffee + " cup of coffee you will need: ");
        /*
        For 1 Cup of Coffee needs > 200 ml of water, 50 ml of milk, and 15 g of coffee beans
        */
        int mlOfWater = (200 * cupsOfCoffee);
        System.out.println(mlOfWater + " ml of water");

        int mlOfMilk = (50 * cupsOfCoffee);
        System.out.println(mlOfMilk + " ml of milk");

        int gOfCoffeeBean = (15 * cupsOfCoffee);
        System.out.println(gOfCoffeeBean + " g of coffee bean");

    }

    static void CalculatesReqAmountOfCoffee(int waterAmount, int milkAmount, int beansAmount, int cups) {

        if ((waterAmount / 200) < cups || (milkAmount / 50) < cups || (beansAmount / 15) < cups) {
            int N = Math.min(Math.min(waterAmount / 200, milkAmount / 50), beansAmount / 15);
            System.out.println("No, I can make only " + N + " cup(s) of coffee");

        } else if ((waterAmount / 200) > cups && (milkAmount / 50) > cups && (beansAmount / 15) > cups) {
            int N = Math.min(Math.min(waterAmount / 200 - cups, milkAmount / 50 - cups), beansAmount / 15 - cups);
            System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the following Option: ");
        System.out.println("1. Stage 1/6 : Hello, coffee!\n"
                + "2. Stage 2/6: Machines have needs\n"
                + "3. Stage 3/6 : Enough coffee for everyone...\n"
                + "4. Stage 4/6 : Action!...\n"
                + "5. Stage 5/6 : On a coffee loop\n"
                + "6. Stage 6/6 : Brushup your code\n");

        System.out.println("Enter the option, please!: ");
        System.out.print(">>");
        int options = scanner.nextInt();

        switch (options) {
            case 1:
                //Stage 1/6 : Hello, coffee!
                startingCoffeeMachine();
                break;

            case 2:
                //Stage 2/6: Machines have needs
                calculateAmountOfIngridents();
                break;

            case 3:
                //Stage 3/6 : Enough coffee for everyone...
                System.out.println("Write how many ml of water the coffee machine has: ");
                int waterAmount = scanner.nextInt();

                System.out.println("Write how many ml of milk the coffee machine has: ");
                int milkAmount = scanner.nextInt();

                System.out.println("Write how many grams of coffee beans the coffee machine has: ");
                int beansAmount = scanner.nextInt();

                System.out.println("Write how many cups of coffee you will need: ");
                int cups = scanner.nextInt();

                CalculatesReqAmountOfCoffee(waterAmount, milkAmount, beansAmount, cups);
                break;

            case 4:
                //Stage 4/6 : Action!...
                break;
            case 5:
                //Stage 5/6 : On a coffee loop
                break;

            case 6:
                //Stage 6/6 : Brushup your code
                break;
        }
    }
}
