package Exo;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int a = Integer.parseInt(stdin.nextLine());
        int b = Integer.parseInt(stdin.nextLine());

        System.out.println(a + b);
    }
}
