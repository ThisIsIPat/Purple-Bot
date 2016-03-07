package core.communication.prompt;

import core.communication.ConsoleInterface;

import java.util.UUID;

public abstract class Prompt<A> {

    private final UUID id;
    private final String question;
    private boolean isQuestionAsked = false;
    private A answer = null;

    protected Prompt(String question) {
        id = UUID.randomUUID();
        this.question = question;
    }

    public void askQuestion() {
        if (question!=null) {
            ConsoleInterface.println(question);
            isQuestionAsked = true;
        }

        answer = readAnswer();
    }

    protected abstract A readAnswer();

    public A getAnswer() {
        return answer;
    }

    public boolean isQuestionAsked() {
        return isQuestionAsked;
    }

    public String getQuestion() {
        return question;
    }

    public UUID getId() {
        return id;
    }
}
