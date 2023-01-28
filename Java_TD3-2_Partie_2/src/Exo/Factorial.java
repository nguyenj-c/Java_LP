package Exo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = Integer.parseInt(stdin.nextLine());

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(number));
    }

    int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
