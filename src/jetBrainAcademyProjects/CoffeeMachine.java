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

    static void CalculatesReqAmountOfCoffee(int waterAmount, int milkAmount, int beansAmount, int cup) {

        if ((waterAmount / 200) < cup || (milkAmount / 50) < cup || (beansAmount / 15) < cup) {
            int N = Math.min(Math.min(waterAmount / 200, milkAmount / 50), beansAmount / 15);
            System.out.println("No, I can make only " + N + " cup(s) of coffee");

        } else if ((waterAmount / 200) > cup && (milkAmount / 50) > cup && (beansAmount / 15) > cup) {
            int N = Math.min(Math.min(waterAmount / 200 - cup, milkAmount / 50 - cup), beansAmount / 15 - cup);
            System.out.println("Yes, I can make that amount of coffee (and even " + N + " more than that)");
        } else {
            System.out.println("Yes, I can make that amount of coffee");
        }


    }

    static void buy(int water, int milk, int beans, int cups, int money) {

        /* If the user writes "buy" then they must choose one of three varieties of coffee that
            the coffee machine can make: espresso, latte, or cappuccino.
For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int list = scanner.nextInt();
        switch (list) {
            case 1://Espresso
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");
                break;

            case 2://Latte
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");

                break;

            case 3://Cappuccino
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");

        }

    }

    static void fill(int water, int milk, int beans, int cups, int money) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();

        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");


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
                int cup = scanner.nextInt();

                CalculatesReqAmountOfCoffee(waterAmount, milkAmount, beansAmount, cup);
                break;

            case 4:
                //Stage 4/6 : Action!...

                int water = 400;
                int milk = 540;
                int beans = 120;
                int cups = 9;
                int money = 550;

                System.out.println("The coffee machine has:\n" +
                        water + " of water\n" +
                        milk + " of milk\n" +
                        beans + " of coffee beans\n" +
                        cups + " of disposable cups\n" +
                        money + " of money");

                System.out.println("Write action (buy, fill, take):");
                String action = scanner.next();
                switch (action) {

                    case "buy":

                        buy(water, milk, beans, cups, money);

                        break;

                    case "fill":

                        fill(water, milk, beans, cups, money);

                        break;

                    case "take":

                        System.out.println("I gave you $" + money);
                        money -= money;

                        System.out.println("The coffee machine has:\n" +
                                water + " of water\n" +
                                milk + " of milk\n" +
                                beans + " of coffee beans\n" +
                                cups + " of disposable cups\n" +
                                money + " of money");

                        break;
                }

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
