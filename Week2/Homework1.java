import java.math.BigInteger;

public class Homework1 {
    public static void main(String[] args) {
        int index = Integer.parseInt(args[0]); //Integer.parseInt takes in a String and returns primitive int value
        BigInteger number = Homework1.calculate(index, new BigInteger("1"), new BigInteger("1")); 
        System.out.println("The " + index + "th Fibonacci number is: " + number);
    }
    public static BigInteger calculate(int index, BigInteger older, BigInteger old) {
        if (index == 1) return older;
        if (index == 2) return old;
        return Homework1.calculate(index-1, old, old.add(older));
    }
}