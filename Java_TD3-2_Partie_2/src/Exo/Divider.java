package Exo;

import java.util.Scanner;


public class Divider {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int number = Integer.parseInt(stdin.nextLine());
        Divider divider = new Divider();
        System.out.println(divider.isDividablePer11(number));
    }

    public boolean isDividablePer11(int number) {
        String representation = String.valueOf(number);
        long sum = 0;

        int i = 0;
        while (true) {
            sum += Integer.parseInt("" + representation.charAt(i));
            ++i;
            if (i == representation.length())
                break;

            sum -= Integer.parseInt("" + representation.charAt(i));
            ++i;
            if (i == representation.length())
                break;
        }

        return sum == 0;
    }
}
