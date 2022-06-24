/**
 * A program to calculate the factorial of the given number
 * Using recursion functionality
 *
 * Expected Input1: 5
 * Expected Output1: 120
 *
 * Expected Input2: 24
 * Expected Output2: 620448401733239439360000
 *
 * Expected Input3: 0
 * Expected Output3: 1
 *
 * Author: Kushang Mistry
 * Date: June 23, 2022
* */

package Day1;

import java.math.BigInteger;

public class FactorialRecursion {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(factorial(n));
    }

    public static BigInteger factorial(int number){
        if(number > 1)
          return factorial(number - 1).multiply(BigInteger.valueOf(number));
        else
            return BigInteger.ONE;
    }
}
