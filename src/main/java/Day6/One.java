package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>(Arrays.asList(10, 4, 8, 13, 20));
        int num = minimizeMemory(myList1, 2);
        System.out.println(num);
    }

    public static int minimizeMemory(List<Integer> processes, int m){

        int rightSum = 0;
        int leftSum = 0;

        for(int i=m; i<processes.size(); i++){
            rightSum += processes.get(i);
        }

        int result = rightSum;

        for(int i=m; i<processes.size(); i++){

            leftSum += processes.get(i-m);
            rightSum -= processes.get(i);

            if(leftSum + rightSum < result){

                result = leftSum + rightSum;
            }
        }

        return result;
    }
}
