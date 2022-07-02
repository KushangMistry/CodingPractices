/**
 * A program to Reverse the given string
 * Using recursion functionality
 *
 * Expected Input1: KUSH
 * Expected Output1: HSUK
 *
 * Expected Input1: HELLO
 * Expected Output1: OLLEH
 *
 * Author: Kushang Mistry
 * Date: June 24, 2022
 * */

package Day2;

public class StringReverseRecursion {
    public static void main(String[] args) {
        String inputString = "HELLO WORLD";
        ReverseTheString(inputString, inputString.length()-1);
    }

    public static void ReverseTheString(String inputString, int stringLength){
        if(stringLength<0)
            return;
        System.out.println(inputString.charAt(stringLength));
        ReverseTheString(inputString, stringLength-1);
    }
}
 