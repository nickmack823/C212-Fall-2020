package Question2;

import java.math.BigDecimal;

public class Question2 { //  Write code to calculate the following expression with BigDecimal objects: 4.35 * 100
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(4.35);
        BigDecimal b = new BigDecimal(100);
        BigDecimal result = a.multiply(b);
        System.out.println(result);
    }
}
