import java.util.Scanner;

/** Prototype_Combination class that takes 
    input from the user and puts that into
    a loop that prints an integer as long
    as it is less than another integer,
    increasing by a certain amount with each
    iteration */
public class Prototype_Combination
{
    // main method to execute code
    public static void main(String[] args)
    {
        // taking input from the user and looping
        Scanner input = new Scanner(System.in);

        int a;
        int b = 10;
        int c = 1;
        System.out.print("Enter an Integer Between 1 and 9: ");
        a = input.nextInt();
        while (a < b)
        {
            a = a + c;
            System.out.println(a);
        }
    } // end main
} // end class