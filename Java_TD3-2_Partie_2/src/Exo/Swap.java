package Exo;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        double a = Double.parseDouble(stdin.nextLine());
        double b = Double.parseDouble(stdin.nextLine());

        double temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}
