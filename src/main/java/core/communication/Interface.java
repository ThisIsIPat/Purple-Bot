package core.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    // A class to manage the input and output from and towards the user.
    // TODO: Work with more classes here in the future. This class will be a very central point.

public class Interface {

    private Interface() { }

    public static void println(String text) {
        System.out.println(text);
    }

    public static String promptln(String prompt) throws IOException {
        System.out.println(prompt);

        return readln();
    }

    public static String readln() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //lol
        return br.readLine();
    }
}
