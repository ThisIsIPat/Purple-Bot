package core.communication.prompt;

import core.communication.ConsoleInterface;

public class TextPrompt extends Prompt<String> {
    public TextPrompt(String question) {
        super(question);
    }

    @Override
    protected String readAnswer() {
        return ConsoleInterface.readln();
    }
}
