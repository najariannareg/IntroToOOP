public class CompareStrings
{

    public static void main(String[] args)
    {

        String firstString = "Hello";

        String secondString = "Hello";

        String thirdString = new String("Hello");



        // The following outputs show that all three strings are "Hello"

        System.out.println("The first string is: " + firstString);

        System.out.println("The second string is: " + secondString);

        System.out.println("The third string is: " + thirdString);



        // Bad comparison of strings

        // In two out of three cases produces a wrong result

        // Due to the == operator comparing objects, not string characters

        // Never code like this!

        System.out.println();
        // An empty line to group output

        System.out.println("The claim that the first and the second strings" +
 " are the same is " + (firstString == secondString));

        System.out.println("The claim that the first and the third strings" +
 " are the same is " + (firstString == thirdString));

        System.out.println("The claim that the second and the third strings" +
 " are the same is " + (secondString == thirdString));



        // Good comparison of strings

        // Produces a correct result since equals() compares string characters

        // You should code like this!

        System.out.println();
        // An empty line to group output

        System.out.println("The claim that the first and the second strings" +
 " are the same is " + firstString.equals(secondString));

        System.out.println("The claim that the first and the third strings" +
 " are the same is " + firstString.equals(thirdString));

        System.out.println("The claim that the second and the third strings" +
 " are the same is " + secondString.equals(thirdString));

    }

}
