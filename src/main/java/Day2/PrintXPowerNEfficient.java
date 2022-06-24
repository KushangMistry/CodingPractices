/**
 * A program to print power of X^N - With logn efficiency
 * Using recursion functionality
 *
 * Expected Input1 X: 2, N: 5
 * Expected Output1: 32
 *
 * Expected Input2 X: 1, N: 65
 * Expected Output2: 1
 *
 * Expected Input3 X: 0, N: 8
 * Expected Output3: 0
 *
 * Author: Kushang Mistry
 * Date: June 24, 2022
 * */

package Day2;

public class PrintXPowerNEfficient {
    public static void main(String[] args){
        int baseX = 3;
        int powerN = 3;

        System.out.println(calculatePower(baseX, powerN));
    }

    public static int calculatePower(int base, int power){
        if(base == 0)
            return 0;
        else if(power == 0)
            return 1;
        if(power % 2 == 0) {
            return calculatePower(base, (power/2)) * calculatePower(base, (power/2));
        }
        else {
            return calculatePower(base, (power/2)) * calculatePower(base, (power/2)) * base;
        }
    }
}
