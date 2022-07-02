/**
 * Given an array of the numbers
 * Reverse the array with minimal time complexity
 *
 * Expected Input1: [1, 2, 3, 4, 5]
 * Expected Output1: [5, 4, 3, 2, 1]
 *
 * Expected Input1: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Expected Output1: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
 *
 * Author: Kushang Mistry
 * Date: July 02, 2022
 * */

package Day5;

import java.util.Arrays;

public class ReverseTheArray {

    private static int[] reverser(int[] inputArray){
        for(int i=0, j=inputArray.length-1; i<inputArray.length/2; i++, j--){
            int temp = inputArray[j];
            inputArray[j] = inputArray[i];
            inputArray[i] = temp;
        }

        return inputArray;
    }

    public static void main(String[] args){

        int[] inputArray = new int[]{1,2,3,4,5};
        int[] inputArray2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(reverser(inputArray)));
        System.out.println(Arrays.toString(reverser(inputArray2)));
    }
}
