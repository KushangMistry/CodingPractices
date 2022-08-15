package Day6;

import java.util.*;

public class B {
    public static void main(String[] args) {
        List<Integer> stockPrice = new ArrayList<>();
        stockPrice.add(1);
        stockPrice.add(3);
        stockPrice.add(2);
        stockPrice.add(3);
        System.out.println(findEarliestMonth(stockPrice));

        stockPrice.clear();
        stockPrice.add(1);
        stockPrice.add(3);
        stockPrice.add(2);
        stockPrice.add(4);
        stockPrice.add(5);
        System.out.println(findEarliestMonth(stockPrice));

    }

    public static int findEarliestMonth(List<Integer> stockPrice) {
        int n = stockPrice.size();
        long suff = 0;

        for (Integer price : stockPrice) {
            suff += price;
        }

        long pref = 0;
        int prefSize = 0;
        int suffSize = n;
        long smallest = Long.MAX_VALUE;
        int smallInd = 0;

        for (int i = 0; i < n - 1; i++) {
            suff -= stockPrice.get(i);
            suffSize--;
            pref += stockPrice.get(i);
            prefSize++;

            long suffAvg = suff / suffSize;
            long prefAvg = pref / prefSize;
            long dif = Math.abs(suffAvg - prefAvg);

            if (dif < smallest) {
                smallest = dif;
                smallInd = i + 1;
            }
        }

        return smallInd;
    }
}
