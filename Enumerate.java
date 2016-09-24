import java.util.*;

public class Enumerate
{
    private enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What size are your shoes?");
        float size = in.nextFloat(); // read data

        Size s = Size.SMALL;
        Size m = Size.MEDIUM;
        
        
        if (size <= 7)
        {
            System.out.println("Your feet are " + s);
        }
        else if (size <= 9)
        {
            System.out.println("Your feet are " + m);
        }
        else if (size <= 11)
        {
            System.out.println("Your feet are " + Size.LARGE);
        }
    }
}
