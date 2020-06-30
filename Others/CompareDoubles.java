public class CompareDoubles
{

    public static final double EPSILON = 0.0000001;


    public static void main(String[] args)
    {

        double firstNumber = 1.000001;

        double secondNumber = 0.000001;

        double differenceOfNumbers = firstNumber - secondNumber;



        // Bad comparison of double floating-point values

        // Produces a wrong result

        // This is due to the loss in the accuracy of internal represetation

        // Never code like this!

        System.out.println("The claim that the difference of " + firstNumber +
 " and " + secondNumber + " equals 1.0 is " + (differenceOfNumbers == 1.0));



        // Good comparison of double floating-point values

        // Produces a correct result, up to some accuracy level

        // You should code like this!

        System.out.println("The claim that the difference of " + firstNumber + " and " + secondNumber + " equals 1.0 is " + (Math.abs(differenceOfNumbers - 1.0) < EPSILON));


        /* Here, instead of directly comparing the values of differenceOfNumbers
 and 1.0 with the operator ==, we compare their difference to a very small constant that we call EPSILON.
 Math is a class in the java.lang package that contains methods for
 basic numeric operations. Math.abs(double) is the method that returns
 the absolute value of a double value. You can check out other methods
 of this class in the online API specification. */

    }

}
