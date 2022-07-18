package Day6;

public class LargestMinimumCharacter {

    public static void main(String[] args) {

        //char[] charArray = {'c', 'f', 'j'};
        char[] charArray = {'e', 'e','e','e','e','e','n','n','n','n',};

        char target = 'e';

        System.out.println(nextGreatestLetter(charArray, target));
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
}
