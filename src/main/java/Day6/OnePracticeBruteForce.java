package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnePracticeBruteForce {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(10, 4, 8, 1));
        System.out.println(removeMinimum(myList, 2));
    }

    public static int removeMinimum(List<Integer> processes, int m){

        int min = Integer.MAX_VALUE;

        for(int i=0; i <= processes.size() - m; i++){

            int sum = 0;

            for(int j=0; j<i; j++){
                sum += processes.get(j);
            }

            for(int j=i+m; j<processes.size(); j++){
                sum += processes.get(j);
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}
