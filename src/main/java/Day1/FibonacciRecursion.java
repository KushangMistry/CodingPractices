/**
 * A program to print n fibonacci numbers
 * Using recursion functionality
 *
 * Expected Input1: 2
 * Expected Output1: 0 1
 *
 * Expected Input2: 5
 * Expected Output2: 0 1 1 2 3
 *
 * Expected Input3: 9
 * Expected Output3: 0 1 1 2 3 5 8 13 21
 *
 * Author: Kushang Mistry
 * Date: June 23, 2022
 * */

package Day1;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int totalTerms = 9;
        System.out.println("0");
        System.out.println("1");
        GenerateFibonacci(0, 1, totalTerms - 2);
    }

    public static void GenerateFibonacci(int firstNumber, int secondNumber, int terms){
        if(terms < 1){
            return;
        }
        System.out.println(firstNumber+secondNumber);
        GenerateFibonacci(secondNumber, firstNumber+secondNumber, terms - 1);
    }
}
