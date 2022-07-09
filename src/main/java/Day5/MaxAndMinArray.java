/**
 * Find the maximum and minimum number from the array
 * with minimal time complexity
 *
 * Expected Input1: [1, 2, 3, 4, 5]
 * Expected Output1: 5
 *                   1
 *
 * Expected Input1: [2, 6, 8, 3, 0, 1, 4]
 * Expected Output1: 8
 *                   0
 *
 * Author: Kushang Mistry
 * Date: July 02, 2022
 * */

package Day5;

public class MaxAndMinArray {

    private static void minMaxFinder(int[] inputArray){
        int min = 0;
        int max = 0;

        if(inputArray.length/2 != 0){
            min = inputArray[inputArray.length/2];
            max = inputArray[inputArray.length/2];
        }

        for(int i=0, j=inputArray.length-1; i<inputArray.length/2; i++, j--){
            if(min > inputArray[i])
                min = inputArray[i];
            else if (min > inputArray[j])
                min = inputArray[j];

            if (max < inputArray[i])
                max = inputArray[i];
            else if (max < inputArray[j])
                max = inputArray[j];
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args){
        int[] inputArray1 = new int[]{1, 2, 3, 4, 5};
        int[] inputArray2 = new int[]{2, 6, 8, 3, 0, 1, 4};

        minMaxFinder(inputArray1);
        minMaxFinder(inputArray2);
    }
}
