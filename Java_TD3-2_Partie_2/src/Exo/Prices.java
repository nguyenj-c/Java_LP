package Exo;

import java.util.Scanner;

public class Prices {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        byte age = Byte.parseByte(stdin.nextLine());
        float price = Float.parseFloat(stdin.nextLine());

        if (age <= 2) {
            price = 0f;
        } else if (age <= 10) {
            price /= 2;
        } else if (age <= 27 || age >= 70) {
            price *= 0.9f;
        }

        System.out.println(price);
    }
}
