/** --- This problem is asked in
 *      one of the interview
 *
 * Put G if element is on same position
 * Put Y if element is there but wrong position
 * Put R if element won't be there in String
 *
 * Expected Input1
 *      BASE STRING: "STEVE"
 *      USER INPUT: "SSVSE"
 *
 * Expected Output1: "GRYRG"
 *
 * Author: Kushang Mistry
 * Date: July 09, 2022
 * */

package Day5;

import java.util.HashMap;
import java.util.Map;

public class Wordle {

    private static String wordleFinder(String baseStr, String inputStr){

        Map<Character, Integer> wordleMap = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for(int i=0; i<baseStr.length(); i++){
            if(wordleMap.containsKey(baseStr.charAt(i))){
                wordleMap.put(baseStr.charAt(i), wordleMap.get(baseStr.charAt(i)) + 1);
            } else {
                wordleMap.put(baseStr.charAt(i), 1);
            }
        }

        for(int i=0; i<inputStr.length(); i++){
            if(wordleMap.get(inputStr.charAt(i)) > 0) {
                if(baseStr.charAt(i) == inputStr.charAt(i)){
                    result.append("G");
                    wordleMap.put(baseStr.charAt(i), wordleMap.get(baseStr.charAt(i)) - 1);
                } else {
                    result.append("Y");
                    wordleMap.put(baseStr.charAt(i), wordleMap.get(baseStr.charAt(i)) - 1);
                }
            } else {
                result.append("R");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(wordleFinder("STEVE", "SSVSE"));
    }
}
