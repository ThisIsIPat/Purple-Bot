package core.communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    // A class to manage the input and output from and towards the user.
    // TODO: Work with more classes here in the future. This class will be a very central point.

public class ConsoleInterface {

    private ConsoleInterface() { }

    public static void println(String text) {
        System.out.println(text);
    }

    public static String readln() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            println("There was an internal error at reading the console input.");
            println("Please contact the developer on http://github.com/ThisIsIPat/ about this issue.");
            println("---");
            println("I PROMISE TO HELP AS FAST AS I CAN. THANKS FOR HELPING OTHERS WITH THE SAME ISSUE :)");
            throw new RuntimeException("No console input recognized");
        }
    }
}
