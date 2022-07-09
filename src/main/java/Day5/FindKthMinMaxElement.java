/** --- This problem is yet to be implemented
 *      with proper optimization
 *
 * Find Kth minimum element from the array
 * with minimal time complexity
 *
 * Expected Input1: [1, 2, 3, 4, 5]
 * K: 3
 * Expected Output1: 3
 *
 * Expected Input1: [2, 6, 8, 3, 0, 1, 4]
 * Expected Output1: 3
 *                   2
 *
 * Author: Kushang Mistry
 * Date: July 02, 2022
 * */

package Day5;

public class FindKthMinMaxElement {

    private static int findMin(int[] inputArray, int position){

        // This is bubble sort
        // More efficient way to do this is
        // Using - Quick Select Algorithm
        for(int i=0; i<inputArray.length-1; i++){
            for(int j=0; j<inputArray.length-i-1;j++){
                if(inputArray[j]>inputArray[j+1]){
                    int temp = inputArray[j+1];
                    inputArray[j+1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        return inputArray[position-1];
    }

    public static void main(String[] args) {
        int[] inputArray1 = new int[]{1, 2, 3, 4, 5};
        int[] inputArray2 = new int[]{2, 6, 8, 3, 0, 1, 4};

        // Finds Kth Minimum Only
        System.out.println(findMin(inputArray1, 3));
        System.out.println(findMin(inputArray2, 7));
    }
}
