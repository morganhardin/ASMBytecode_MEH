/** Prototype_While class that takes 
    an integer and loops until while
    that integer is less than another
    integer, increasing by one during
    each iteration */
public class Prototype_While
{
    // main method to execute code
    public static void main(String[] args)
    {
        /** declaring two integers and
            looping while one is less
            than the other, increasing by
            one with each loop */
        int a = 1;
        int b = 5;
        while (a < b)
        {
            System.out.println(a);
            a = a + 1;
        }
    } // end main
} // end class