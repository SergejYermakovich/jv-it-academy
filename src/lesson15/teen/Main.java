package lesson15.teen;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter("test.txt"));
        bufferedWriter.write("write from BufferedWriter");
        bufferedWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        int symbol = fileReader.read();
        while (symbol != -1) {
            System.out.print((char) symbol);
            symbol = fileReader.read();
        }
        fileReader.close();

        System.out.println("\nBufferedReader: ");

        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        String line = bufferedReader.readLine();
        System.out.println(line);

    }
}
