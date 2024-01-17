package lesson15;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


// !3 = 3 * 2 * 1 = 6 = 3 * !2
public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(3));
    }


    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
