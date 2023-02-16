import java.util.Scanner;

public class dz1 {
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Cумма чисел от 1 до введённого числа: " + findSumOfDigitsRecursion(number));
        System.out.println("Произведение чисел от 1 до введённого числа: " + findFactorialRecursion(number));
    }

    public static int findSumOfDigitsRecursion(int n) {
        if (n == 1) return 1;
        return n + findSumOfDigitsRecursion(n - 1);
    }

    public static int findFactorialRecursion(int n) {
        if (n == 1) return 1;
        return n * findFactorialRecursion(n - 1);
    }

    public static int findSumOfDigits(int n) {
        int sumOfDigits = 0;
        for (int i = 0; i <= n; i++) {
            sumOfDigits += i;
        }
        return sumOfDigits;
    }

    public static int findFactorial(int n) {
        int multiplicationResult = 1;
        for (int i = 1; i <= n; i++) {
            multiplicationResult *= i;
        }
        return multiplicationResult;
    }
}

