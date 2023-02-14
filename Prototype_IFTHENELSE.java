/** Prototype_IFTHENELSE class that takes 
    two integers and compares them,
    printing the greater of the two or
    printing that they are equal */
public class Prototype_IFTHENELSE
{
    // main method to execute code
    public static void main(String[] args)
    {
        // comparing two integers
        int a = 81733;
        int b = 67396;
        if (a > b)
        {
            System.out.println(a);
        }
        else if (a < b)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("Both are Equal");
        }

        // comparing two shorts
        short c = (short) 695;
        short d = (short) 957;
        if (c > d)
        {
            System.out.println(c);
        }
        else if (c < d)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println("Both are Equal");
        }

        // comparing two longs
        long e = 18395234l;
        long f = 18395234l;
        if (e > f)
        {
            System.out.println(e);
        }
        else if (e < f)
        {
            System.out.println(f);
        }
        else
        {
            System.out.println("Both are Equal");
        }
    } // end main
} // end class