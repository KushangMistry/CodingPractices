package Day1;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int totalTerms = 10;
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
