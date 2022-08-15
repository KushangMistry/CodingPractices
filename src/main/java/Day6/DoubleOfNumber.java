package Day6;

import java.util.Arrays;

public class DoubleOfNumber {

    public static void main(String[] args) {

        int[] myArray1 = {-20,8,-6,-14,0,-19,14,4};
        int[] myArray = {-2,0,10,-19,4,6,-8};

        System.out.println(checkIfExist(myArray));
    }

    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);

        boolean flag = false;

        int mid = 0;

        for(int i=0; i<arr.length; i++){

            int start = 0;
            int end = arr.length - 1;

            while(start <= end){

                mid = start + (end-start)/2;

                if(arr[mid] > arr[i]*2)
                    end = mid - 1;
                else if(arr[mid] < arr[i]*2)
                    start = mid + 1;
                else if(arr[mid] == arr[i]*2)
                {
                    flag = true;
                    break;
                }

                if(start == end)
                    continue;
            }
        }

        if(flag && arr[mid] == 0){
            for(int i=0; i<arr.length; i++){
                if(i == mid)
                    continue;
                if(arr[i] == 0)
                    return true;
            }
        } else if (flag && arr[mid] != 0) {
            return true;
        }

        return false;
    }
}
