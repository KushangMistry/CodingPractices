/**
 * Given a set of characters and a positive integer k
 * print all possible strings of length k that can be formed from the given set.
 * Using recursion functionality
 *
 * Expected Input1: set[] = {'a', 'b'}, k = 3
 * Expected Output1: aaa
 *                   aab
 *                   aba
 *                   abb
 *                   baa
 *                   bab
 *                   bba
 *                   bbb
 *
 * Expected Input1: set[] = {'a', 'b', 'c', 'd'}, k = 1
 * Expected Output1: a
 *                   b
 *                   c
 *                   d
 *
 * Author: Kushang Mistry
 * Date: June 27, 2022
 * */

package Day4;

public class PrintAllPossibleCombinations {

    private static void printCombinations(String inputString, int expectedLength, int index, String finalString){
        if(index == expectedLength){
            System.out.println(finalString);
            return;
        }

        printCombinations(inputString, expectedLength, index+1, finalString+inputString.charAt(index));

        printCombinations(inputString, expectedLength, index+1, finalString);
    }

    public static void main(String[] args){
        String inputString1 = "ab";
        int expectedLength1 = 3;

        String inputString2 = "abcd";
        int expectedLength2 = 1;

        printCombinations(inputString1, expectedLength1, 0,"");
        printCombinations(inputString2, expectedLength2, 0,"");
    }
}
