/** Prototype_Compare class that compares
    integers, shorts, and longs and prints 
    the greater of the two through an if
    statement */
public class Prototype_Compare
{
    // main method to execute code
    public static void main(String[] args)
    {
        /** comparing two integers and 
            printing the greatest value */
        int a = 918375;
        int b = 174891;
        if (a > b)
        {
            System.out.println(a);
        }
        if (b > a)
        {
            System.out.println(b);
        }

        /** comparing two shorts and 
            printing the greatest value */
        short c = 1283;
        short d = 2749;
        if (c > d)
        {
            System.out.println(c);
        }
        if (d > c)
        {
            System.out.println(d);
        }

        /** comparing two longs and 
            printing the greatest value */
        long e = 987643l;
        long f = 247394l;
        if (e > f)
        {
            System.out.println(e);
        }
        if (f > e)
        {
            System.out.println(f);
        }
    } // end main
} // end class