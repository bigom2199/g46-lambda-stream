package lexicon.se;

import lexicon.se.interfaces.DoStringStuff;
import lexicon.se.interfaces.DoubleOperator;
import lexicon.se.interfaces.IntRandom;
import lexicon.se.interfaces.Printer;

import java.sql.SQLOutput;
import java.util.Random;

public class LambdaDemo{
    static DoStringStuff concatOperator = ((s1, s2) -> s1 + "  " +  s2);
    static DoStringStuff getBiggestString = ((s1, s2) -> s1.length() >= s2.length()? s1: s2) ;
    static DoubleOperator additionOperator = (number1,number2 )-> number1+number2;
    static DoubleOperator subtractionOperator = (number1,number2) -> number1- number2;
    public static double calcOperator(double n1, double n2, DoubleOperator operator) {
        return operator.apply(n1,n2) ;
    }
    public static String doStringStuff(String s1, String s2, DoStringStuff stringOperator) {
        return stringOperator.operate(s1,s2) ;
    }

    public static void main(String[] args) {
 // String operate(String s1,String s2) ;
        DoStringStuff ConcatOperator =(s1,s2 ) -> s1 + " " + s2;
        System.out.println(ConcatOperator .operate("Mehrdad","Javan"));
        DoStringStuff getBiggestString = ((s1, s2) -> s1.length()>= s2.length()? s1:s2);
        System.out.println(getBiggestString.operate("Mehrdad" ,"Javan")) ;
        System.out.println("----------------");
        System.out.println(doStringStuff("Mehrdad","Javan",concatOperator));
        System.out.println(doStringStuff("Mehrdad" ,"Javan" ,getBiggestString));
        System.out.println(additionOperator.apply(12d,10d));
        System.out.println(subtractionOperator.apply(12d,10d));
        System.out.println(calcOperator(10d,5d,additionOperator));
        System.out.println(calcOperator(10d,5d,subtractionOperator));
        // int generate();
        IntRandom randomNumberOperator = () -> new Random().nextInt();
        System.out.println(randomNumberOperator.generate());

        Printer printMessage = message -> System.out.println(message) ;
        printMessage.print("Hello Lambda!");

    }
}

