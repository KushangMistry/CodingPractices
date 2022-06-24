/**
 * A program to print steps to solve tower of hanoi problem
 * Using recursion functionality
 *
 * Expected Input1: 3
 * Expected Output1: Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *
 * Expected Input1: 2
 * Expected Output1: Transferred one disc
 *                   Transferred one disc
 *                   Transferred one disc
 *
 * Author: Kushang Mistry
 * Date: June 24, 2022
 * */

package Day2;

import java.util.Calendar;

public class TowerOfHanoiRecursion {
    public static void main(String[] args) {
        int towerHeight = 2;
        CalculateSteps(towerHeight, "A", "B", "C");
    }

    public static void CalculateSteps(int height, String source, String helper, String destination){
        if(height == 1){
            System.out.println("Transferred one disc");
            return;
        }
        CalculateSteps(height-1, source, destination, helper);
        System.out.println("Transferred one disc");
        CalculateSteps(height-1, helper, source, destination);
    }
}
