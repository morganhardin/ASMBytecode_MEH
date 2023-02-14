// imports scanner from the util library
import java.util.Scanner;

/** Prototype_Input class that takes 
    integer, long, and double input
    from the user and prints it */
public class Prototype_Input
{
    // main method to execute code
    public static void main(String[] args)
    {
        // creates a new instance of scanner
        Scanner input = new Scanner(System.in);

        // takes integer input and prints it
        System.out.print("Enter an Integer: ");
        int a = input.nextInt();
        System.out.println(a);

        // takes long input and prints it
        System.out.print("Enter a Long: ");
        long b = input.nextLong();
        System.out.println(b);

        // takes double input and prints it
        System.out.print("Enter a Double: ");
        double c = input.nextDouble();
        System.out.println(c);
    } // end main
} // end class