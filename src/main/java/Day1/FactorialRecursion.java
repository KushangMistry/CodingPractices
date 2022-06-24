package Day1;

import java.math.BigInteger;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int number){
        if(number > 1)
          return factorial(number - 1).multiply(BigInteger.valueOf(number));
        else
            return BigInteger.ONE;
    }
}
