package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneSlidingWindow {

    public static void main(String[] args){

        List<Integer> myList = new ArrayList<>(Arrays.asList(10, 4, 8, 1));
        System.out.println(removeMinimum(myList, 2));
    }

    public static int removeMinimum(List<Integer> processes, int m){

        int max = Integer.MIN_VALUE;
        int windowSum = 0;
        int sum = 0;

        for(int i=0; i<m; i++){
            windowSum += processes.get(i);
        }

        sum = windowSum;
        max = Math.max(max, windowSum);

        for(int i=m; i<processes.size(); i++){
            windowSum -= processes.get(i-m);
            windowSum += processes.get(i);
            sum += processes.get(i);

            max = Math.max(max, windowSum);
        }

        return sum - max;
    }
}
