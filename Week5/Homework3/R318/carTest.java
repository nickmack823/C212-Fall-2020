package Homework3.R318;

public class carTest {
    
    public static void main(String[] args) {
        Car testCar = new Car();
        testCar.fuelEfficiency = 40;
        System.out.println("Starting gas: " + testCar.currentFuel + " gallons");

        System.out.println("Adding gas...");
        testCar.addGas(10);
        System.out.println("Current gas: " + testCar.currentFuel + " gallons");

        System.out.println("Driving...");
        testCar.drive(40);

        System.out.println("Adding more gas...");
        testCar.addGas(0);
        System.out.println("Current gas: " + testCar.currentFuel + " gallons");

        System.out.println("Driving again...");
        testCar.drive(40);

        System.out.println("Expected final gas amount: " + testCar.currentFuel + " gallons");
        System.out.println("Actual final gas amount: " + testCar.currentFuel + " gallons");
    }

}
