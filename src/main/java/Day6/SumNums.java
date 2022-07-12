package Day6;

import java.util.List;
import java.util.ArrayList;

public class SumNums {

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9,9};
        int k = 1;

        System.out.println(addToArrayForm(arr, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        long sum = 0L;

        for(int i=0; i<num.length; i++){

            sum = sum*10 + num[i];
        }

        sum += k;

        List<Integer> converted = new ArrayList<>();

        while(sum > 0){

            converted.add(0, (int)(sum % 10));

            sum = sum / 10;
        }

        return converted;
    }
}
