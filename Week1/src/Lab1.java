public class Lab1 // Class must be defined in all Java files at first thing
{
    public static void main(String[] args) // 'main' function; 'public' means accessible by any class, 'static' means it can be called at any time
    {
        int first = Integer.parseInt(args[0]); // Defining variables 'first' and 'second' as int (int before variable)
        int second = Integer.parseInt(args[1]);



        int result = Integer.max(first, second); // returns biggest of two input integers
        System.out.println("The largest number between " + first + " and " + second + " is " + result);
    }

//    public static int largest(int a, int b) // Uses new function named 'largest' to calculate integer rather than calculating in main
//    {
//        int result = Integer.max(a, b);
//        return result;
//    }
}