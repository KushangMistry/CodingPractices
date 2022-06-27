/**
 * A program to print all sub-sequences from the given string
 * Using recursion functionality
 *
 * Expected Input1: "ABC"
 * Expected Output1: A
 *                   AB
 *                   ABC
 *                   B
 *                   BC
 *                   C
 *
 * Author: Kushang Mistry
 * Date: June 26, 2022
 * */

package Day3;

public class PrintAllSubsequences {

    private static void printSubsequences(String inputString, int index, String finalString){

        if(index == inputString.length()){
            System.out.println(finalString);
            return;
        }

        printSubsequences(inputString, index+1, finalString+String.valueOf(inputString.charAt(index)));

        printSubsequences(inputString, index+1, finalString);
    }

    public static void main(String[] args){
        printSubsequences("AAA", 0, "");
    }
}
