// example in p42
public class FirstSample
{
    public static void main(String[] args)
    {
        System.out.println("We will not use 'Hello, World!'");
        System.out.println();
        System.out.print("Hello");
        System.out.println("World!");

        // variables
        double 工资 = 1_000;
        int vacationDays =  12;
        long earthPopulation;
        boolean done;
        
        System.out.println(String.format("number of vacation days: %d",
                                         vacationDays));
        System.out.println(String.format("工资是: %.1f", 工资));
    }
}
