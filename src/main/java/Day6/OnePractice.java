package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnePractice {

    public static void main(String[] args){

        // [10, 4, 8, 13, 20], m=2

        List<Integer> myList = new ArrayList<>(Arrays.asList(10, 4, 8, 13, 20));

        System.out.println(removeMinimum(myList, 2));
    }

    public static int removeMinimum(List<Integer> processes, int m){

        int rightSum = 0;
        int leftSum = 0;

        for(int i=m; i<processes.size(); i++)
            rightSum += processes.get(i);

        int result = rightSum;

        for(int i=m; i<processes.size(); i++){
            leftSum += processes.get(i-m);
            rightSum -= processes.get(i);

            if(leftSum + rightSum < result)
                result = leftSum + rightSum;
        }

        return result;
    }
}
