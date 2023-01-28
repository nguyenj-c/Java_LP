package Exo;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double min = Double.parseDouble(stdin.nextLine());

        for (byte i = 0; i < 9; ++i) {
            double input = Double.parseDouble(stdin.nextLine());
            if (input < min)
                min = input;
        }

        System.out.println(min);
    }
}
