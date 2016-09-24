// example in p55
public class Constants
{
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args)
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
                           CM_PER_INCH + " by " + paperHeight *
                           CM_PER_INCH);

        double x = 4;
        double y = Math.sqrt(x);
        double z = Math.pow(x, y);
        int a = 16;
        int b = 3;
        int c = 2;
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a % b);
        System.out.println(Math.floorMod(a, b));

        double f = 9.997;
        int tx = (int) f;
        int nx = (int) Math.round(f);
        System.out.println(tx);
        System.out.println(nx);
    }
}
