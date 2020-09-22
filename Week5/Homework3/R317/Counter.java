package Homework3.R317;

public class Counter {

    private int value; // Instance variables should be private

    public int getValue(){
        return value;
    }
    public void click(){
        value = value + 1;
    }
    public void reset(){
        value = 0;
    }
}
