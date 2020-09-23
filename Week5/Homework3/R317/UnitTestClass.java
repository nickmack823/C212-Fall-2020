package Homework3.R317;

public class UnitTestClass {
    
    public static void main(String[] args) { // Main function to test Class functionality
        Counter testCounter = new Counter();
        System.out.println("Counter value is: " + testCounter.getValue()); // Calling getValue method on testCounter instance of Counter class

        testCounter.click(); // Testing
        testCounter.click(); // the
        testCounter.click(); // click
        System.out.println("Counter value is: " + testCounter.getValue());

        testCounter.reset();
        System.out.println("Counter value is: " + testCounter.getValue());
        System.out.println("+---+\n| |\n+---+");

    }
}

