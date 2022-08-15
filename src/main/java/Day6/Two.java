package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two {

    public static void main(String[] args) {

        List<Integer> myList1 = new ArrayList<>(Arrays.asList(1000000000, 3, 2, 4, 5));
        int num = findEarliestMonth(myList1);

        System.out.println(num);
    }

    public static int findEarliestMonth(List<Integer> stockPrice){

        if(stockPrice.size() == 1){
            return stockPrice.get(0);
        }

        int length = stockPrice.size();
        long minChange = Integer.MAX_VALUE;
        long sum = 0;

        long leftSum = 0;
        long minChangeIndex = 0;

        for(Integer i: stockPrice){
            sum = sum + i;
        }

        // 1, 3, 2, 4, 5
        for(int i=0; i<=length-1; i++){

            leftSum += stockPrice.get(i);

            long leftAvg = leftSum/(i+1);
            long rightSum = sum - leftSum;
            long rightAvg;

            if(i == length - 1){
                rightAvg = 0;
            } else {
                rightAvg = rightSum/(length-i-1);
            }

            long currentChange = Math.abs(leftAvg - rightAvg);

            if (currentChange < minChange) {
                minChangeIndex = i;
                minChange = currentChange;
            }
        }

        return (int)minChangeIndex+1;
    }
}
