package Exo;

import java.io.PrintStream;
import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int number = Integer.parseInt(stdin.nextLine());
        int base = Integer.parseInt(stdin.nextLine());

        BaseConverter converter = new BaseConverter();
        converter.printConvertedBaseFromDec(number, base, System.out);
        System.out.flush();
    }

    /**
     * takes a decimal number and prints the result to a stream as it converts it to another base
     * note: it doesn't automatically flush for you
     * @param number decimal number to convert
     * @param base base to convert to. should be in [2; 9]. if not in range, expect undefined behaviour
     */
    public void printConvertedBaseFromDec(int number, int base, PrintStream stream) {
        if (number == 0)
            return;

        printConvertedBaseFromDec(number / base, base, stream);
        stream.print(number % base);
    }
}
