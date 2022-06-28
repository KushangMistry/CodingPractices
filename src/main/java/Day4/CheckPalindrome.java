/**
 * A program to check weather given string is palindrome or not
 * Using recursion functionality
 *
 * Expected Input1: "2002"
 * Expected Output1: true
 *
 * Expected Input1: "INDIA"
 * Expected Output1: false
 *
 * Author: Kushang Mistry
 * Date: June 27, 2022
 * */

package Day4;

public class CheckPalindrome {

    private static boolean checkPalindrome(String inputString, int index, int length){

        if(index == inputString.length()/2){
            return true;
        }

        if(inputString.charAt(index) == inputString.charAt(length)){
            checkPalindrome(inputString, index+1, length-1);
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args){
        String inputString1 = "2002";   // true
        String inputString2 = "INDIA";  // false
        String inputString3 = "AWESOME";// false
        String inputString4 = "COROROC";// true
        String inputString5 = "KE2EK";  // true

        System.out.println(checkPalindrome(inputString1, 0, inputString1.length()-1));
        System.out.println(checkPalindrome(inputString2, 0, inputString2.length()-1));
        System.out.println(checkPalindrome(inputString3, 0, inputString3.length()-1));
        System.out.println(checkPalindrome(inputString4, 0, inputString4.length()-1));
        System.out.println(checkPalindrome(inputString5, 0, inputString5.length()-1));
    }
}
