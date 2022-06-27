/**
 * A program to remove duplicate characters from the string
 * Using recursion functionality
 *
 * Expected Input1: "HELLO"
 * Expected Output1: "HELO"
 *
 * Expected Input1: "AADARSHHA"
 * Expected Output1: "ADRSH"
 *
 * Author: Kushang Mistry
 * Date: June 26, 2022
 * */

package Day3;

public class RemoveDuplicates {

    private static void removeDuplicate(String inputString, int index, String finalString){

        if(index == inputString.length()){
            System.out.println(finalString);
            return;
        }

        if(finalString.contains(String.valueOf(inputString.charAt(index)))){
            removeDuplicate(inputString, index+1, finalString);
        }
        else {
            finalString+=inputString.charAt(index);
            removeDuplicate(inputString, index+1, finalString);
        }
    }

    public static void main(String[] args){
        removeDuplicate("HELLO", 0, "");
        removeDuplicate("AADARSHHA", 0, "");
        removeDuplicate("ABBCCDA", 0, "");
    }
}
