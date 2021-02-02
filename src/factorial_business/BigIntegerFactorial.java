package factorial_business;

import java.math.BigInteger;
import java.util.Scanner;

//calculate factorial of any integer with BigInteger, iteratively and recursively (tail recursion here)
public class BigIntegerFactorial {

    //demo
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int to get its factorial: ");
        int input = in.nextInt();
        System.out.println(calcFactorialIterative(input));
        System.out.println(calcFactorialRecursive(input));

    }

    public static BigInteger calcFactorialIterative(long num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }

    public static BigInteger calcFactorialRecursive(long num) {
        return calcFactorialRecursive(num, BigInteger.ONE);
    }

    private static BigInteger calcFactorialRecursive(long num, BigInteger result) {

        //num decrements value for next recursive call, bringing the operation closer to base case
        //the second parameter stores result by multiplying current value of num by the result
        // of all past recursive calls
        return num == 1
                ? result
                : calcFactorialRecursive(num--, new BigInteger(num + "")
                .multiply(new BigInteger(result + "")));
    }
}
