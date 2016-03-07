package core;

import core.communication.ConsoleInterface;
import net.dv8tion.jda.JDA;
import net.dv8tion.jda.JDABuilder;

import javax.security.auth.login.LoginException;

// Main class with main method, being called at the start of the application.
    // The whole application starts from here, as defined in the pom.xml.

public class Init {

    public static void log(String message) {
        ConsoleInterface.println(message);
    }

    public static void main(String[] args) {
        ConsoleInterface.println("Copyright (c) 2016 Patrick Hein");
        ConsoleInterface.println("Purple Bot - CREATE, EXPERIENCE, TOGETHER.");
        ConsoleInterface.println("---------------------------------------");

        log("Initializing Discord Connection...");
        try {
            JDA jda = new JDABuilder("muellschrotti@googlemail.com","purpl33b0ddom").buildAsync();
        } catch (LoginException e) {
            ConsoleInterface.println("Login not successful.");
            throw new RuntimeException(e);
        }
    }
}
