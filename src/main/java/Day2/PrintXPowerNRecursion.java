/**
 * A program to print power of X^N
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

public class PrintXPowerNRecursion {
    public static void main(String[] args) {
        int baseX = 2;
        int powerN = 0;

        System.out.println(calculatePower(baseX, powerN));
    }

    public static int calculatePower(int base, int power){
        if (power > 0){
            return base * calculatePower(base, --power);
        }
        else
            return 1;
    }
}
