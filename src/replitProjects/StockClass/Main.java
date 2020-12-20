package replitProjects.StockClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter the Ticker Symbol: ");
        String ts = input.nextLine();

        System.out.print("Enter the Company Name: ");
        String cn = input.nextLine();

        System.out.print("Enter the opening price: $");
        int p = input.nextInt();

        System.out.print("Enter the Total shares: ");
        int tshr = input.nextInt();

        // create an object of Stock class
        Stock obj1 = new Stock(ts, cn, p, tshr);

        // enter change in price here
        System.out.print("\nEnter the closing price: $");
        int np = input.nextInt();

        // call the method of Stock class
        obj1.adjustPrice(np);

        // print the toString method using object
        System.out.println("\n"+ obj1);

    }
}
/*
You are creating a Stock class.

1. Class Variables
tickerSymbol (String)
companyName (String)
price (int)
percentChange (double)
totalShares(int)
marketCap(long)

2. Constructor
Constructor must initialize:
tickerSymbol (and convert the string to uppercase)
companyName
price
totalShares

And calculate

marketCap is calculated by multiplying totalShares by price

3. Class MethodsWrite the following methods:

public void adjustPrice(int value)
This method will change the price by value (value can be positive or negative).  It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed

public String toString()
This method should return a SINGLE String (using \n) that represents something like the following:
Ticker Symbol: GOOG
Company: Google, Inc.
Current Price: $802 (+7.2%)
Market Cap: $538000000000
 */