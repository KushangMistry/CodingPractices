/**
 * A program to check weather given array is sorted or not
 * Using recursion functionality
 *
 * Expected Input1: {1,2,3,4,5}
 * Expected Output1: true
 *
 * Expected Input1: {1,2,6,4,5}
 * Expected Output1: false
 *
 * Author: Kushang Mistry
 * Date: June 24, 2022
 * */

package Day2;

public class IsArraySorted {
    public static void main(String[] args){
        int[] inputArray = {1,2,6,4,5};

        int arrayIndex = 0;
        System.out.println(checkIfSorted(inputArray, arrayIndex));
    }

    private static boolean checkIfSorted(int[] inputArray, int arrayIndex){
        if(inputArray.length-1 == arrayIndex)
            return true;

        if(inputArray[arrayIndex+1] < inputArray[arrayIndex])
            return false;
        else
            return checkIfSorted(inputArray, arrayIndex+1);
    }
}
