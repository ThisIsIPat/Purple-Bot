package core.communication.prompt;

import core.communication.ConsoleInterface;

public class NumericPrompt extends Prompt<Integer> {
    protected NumericPrompt(String question) {
        super(question);
    }

    @Override
    protected Integer readAnswer() {
        return Integer.parseInt(ConsoleInterface.readln());
    }
}
