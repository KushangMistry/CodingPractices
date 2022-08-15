package Day6;

import java.util.*;

public class A {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(6);
        arr.add(2);
        System.out.println(makePowerNonDecreasing(arr));

        arr.clear();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(makePowerNonDecreasing(arr));
    }

    public static long makePowerNonDecreasing(List<Integer> power) {
        int totalAdd = 0;
        for(int i=1;i<power.size();i++) {
            power.set(i,power.get(i)+totalAdd);
            if(power.get(i)<power.get(i-1)) {
                totalAdd += power.get(i-1) - power.get(i);
                power.set(i,power.get(i-1));
            }
        }
        return totalAdd;
    }
}