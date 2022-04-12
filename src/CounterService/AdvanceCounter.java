package CounterService;

import CounterService.GeneralCounter;

public class AdvanceCounter extends GeneralCounter {

    // override
    public static void add(int x, int y)
    {
        System.out.println("Result: " + (x+y));
    }

    // overloading
    public static void add(int x, int y, int z) {
        System.out.println("Result: " + (x+y+z));
    }

    public static void multiply(int x, int y)
    {
        System.out.println("Result: " + (x*y));
    }

    public static void div(double x, double y)
    {
        System.out.println("Result: " + (x / y));
    }
}