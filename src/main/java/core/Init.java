package core;

import core.communication.Interface;

import java.io.IOException;

    // Main class with main method, being called at the start of the application.
    // The whole application starts from here, as defined in the pom.xml.

public class Init {
    public static void main(String[] args) throws IOException {
        Interface.println("This is using a custom method, they are more or less like Functions...");
        String answer = Interface.promptln("Are you ready for the matrix?");
        if (answer.equalsIgnoreCase("yes")) {
            Interface.println("Well, I don't have the pills with me. Awkwaaard.");
        } else if (answer.equalsIgnoreCase("no")) {
            Interface.println("What are you, a loser?");
        } else {
            Interface.println("Uhh...whatever YOU say.");
        }
        Interface.println("I guess I'll just go then.");
    }
}
