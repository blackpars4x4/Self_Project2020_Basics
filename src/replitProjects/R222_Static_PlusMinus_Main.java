package replitProjects;

public class R222_Static_PlusMinus_Main {
    public static void main(String[] args) {

        System.out.println("1+1 = "+R222_Static_PlusMinus.plus(1,1) );
        System.out.println("1-1 = "+R222_Static_PlusMinus.minus(1,1) );

    }
}
/*
A static method can be used without instantiating a class object.

like in the calculator class create a plus and minus. but this time make them static methods.

plus: gets two ints and returns the addition of the to numbers as an int

Calc.plus(1,1)
returns:2

Calc.plus(10,1)
returns:11

minus:  the same as plus its also static, but it returns the substructed value of the two ints it gets

Calc.minus(1,1)
returns:0

Calc.plus(10,1)
returns:9
 */