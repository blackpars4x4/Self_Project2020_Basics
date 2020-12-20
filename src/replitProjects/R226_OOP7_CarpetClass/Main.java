package replitProjects.R226_OOP7_CarpetClass;

public class Main {
    public static void main(String[] args) {

        Carpet c  = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(20,20,2,false);
        System.out.println(c2.totalPrice);

        Carpet c3 = new Carpet(20,20,2,true);
        System.out.println(c3.totalPrice);

    }
}
/*
Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.

Add following constructors:

1) No-Args constructor
  -sets default values for the Carpet object
   Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.

2) 4-Args  Constructor:
- accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables. try to use this. keyword

Set totalPrice as the width + length multiplied by the unitPrice.

if its a Persian carpet add 200 to totalPrice.

for example:

Carpet c = new Carpet();
System.out.println(c.totalPrice); // 200


Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
System.out.println(c2.totalPrice); // 80
the calculation:(20+20)*2


Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
System.out.println(c3.totalPrice); // 280

the calculation:(20+20)*2 +200
 */