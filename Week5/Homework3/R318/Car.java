package Homework3.R318;

public class Car {

    int fuelEfficiency;
    int currentFuel = 0;

    // public Car() {
    //     fuelEfficiency = 40;
    // }
    public int gasCount(){
        return currentFuel;
    }
    public void drive(int distance){
        currentFuel = currentFuel - (distance/fuelEfficiency);
    }
    public void addGas(int gasAdded){
        currentFuel = currentFuel + gasAdded;
    }
}
