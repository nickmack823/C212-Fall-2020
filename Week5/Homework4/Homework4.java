public class Homework4 {
  
    public static void main(String[] args) {
      int n = 10; 
      System.out.println("First identity");
      System.out.println(" 1 + 2 + ... + " + n + " = " + Homework4.sum(n)); 
      System.out.println("Second identity");
      System.out.println(" 1² + 2² + ... + " + (n * n) + " = " + Homework4.squared(n)); 
      System.out.println("Third identity");
      System.out.println(" 1³ + 2³ + ... + " + (n * n * n) + " = " + Homework4.cubed(n)); 
    }
    public static int sum(int n) {
      int summation = (n * (n + 1))/2;
      return summation;
    }
    public static int squared(int n) {
        int squaredResult = ( (n * (n + 1) * ((2 * n) + 1) )/6);
        return squaredResult;
    }
    public static int cubed(int n){
        int cubedResult = ( (n * n * ( (n + 1) * (n + 1) ) /2 ) );
        return cubedResult;
    }
  } 
  