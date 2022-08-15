package Day6;

import java.util.ArrayList;
import java.util.List;

public class LargestMinimumCharacter {

    public static void main(String[] args) {

        //char[] charArray = {'c', 'f', 'j'};
        char[] charArray = {'e', 'e','e','e','e','e','n','n','n','n',};

        char target = 'e';

        System.out.println(nextGreatestLetter(charArray, target));

        System.out.println(isAnagram("a", "ab"));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[letters.length - 1])
            return letters[0];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(letters[mid] == target)
                return letters[mid+1];

            if(letters[mid] > target)
                end = mid;
            else
                start = mid + 1;

            if(start == end)
                return letters[start];
        }

        return letters[0];
    }

    public static boolean isAnagram(String s, String t) {

        List<Character> tracker = new ArrayList<>();

        char[] str1 = s.toCharArray();

        char[] str2 = t.toCharArray();

        for(char c: str1){

            tracker.add(c);
        }

        for(char c: str2){

            tracker.remove(Character.valueOf(c));
        }

        if(tracker.size() > 0)
            return false;
        else
            return true;
    }
}
