/**
 * A program to add occurred X at the end from the given string
 * Using recursion functionality
 *
 * Expected Input1: "HEXXLXO"
 * Expected Output1: "HELOXXX"
 *
 * Expected Input1: "XKUXSH"
 * Expected Output1: "KUSHXX"
 *
 * Author: Kushang Mistry
 * Date: June 26, 2022
 * */

package Day3;

public class AddRecurringXAtEnd {

    private static void moveXAtEnd(String inputString, int index, int counter, String finalString){

        if(index == inputString.length()) {
            for(int i=0; i<counter; i++){
                finalString+="X";
            }
            System.out.println(finalString);
            return;
        }

        if(inputString.charAt(index) == 'X'){
            moveXAtEnd(inputString, index+1, counter+1, finalString);
        }
        else {
            finalString+=inputString.charAt(index);
            moveXAtEnd(inputString, index+1, counter, finalString);
        }
    }

    public static void main(String[] args){
        moveXAtEnd("HEXXLXO", 0, 0, "");
        moveXAtEnd("XKUXSH", 0, 0, "");
    }
}
