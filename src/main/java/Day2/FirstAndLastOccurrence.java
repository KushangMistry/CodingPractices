/**
 * A program to find first and last occurrence of
 * the given character in the given string
 * Using recursion functionality
 *
 * Given String1: "HELLO"
 * Expected Input1: L
 * Expected Output1: 2
 *                   3
 *
 * Given String1: "AVALONIA"
 * Expected Input1: A
 * Expected Output1: 0
 *                   7
 *
 * Author: Kushang Mistry
 * Date: June 24, 2022
 * */

package Day2;

public class FirstAndLastOccurrence {

    private static int firstPosition = -1;
    private static int lastPosition = -1;

    public static void main(String[] args){
        String inputString = "AVALONIA";
        char inputCharacter = 'A';

        findOccurrence(inputString, inputCharacter, 0);

    }

    private static void findOccurrence(String inputString, char inputCharacter, int index){
        if(index == inputString.length()){
            System.out.println(firstPosition);
            System.out.println(lastPosition);
            return;
        }

        if(inputString.charAt(index) == inputCharacter){
            if(firstPosition == -1)
                firstPosition = index;
            else
                lastPosition = index;
        }

        findOccurrence(inputString, inputCharacter, index+1);
    }
}
