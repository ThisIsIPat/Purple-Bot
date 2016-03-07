package core.communication.prompt;

import core.communication.ConsoleInterface;

import java.util.ArrayList;

public class BooleanPrompt extends Prompt<Boolean> {

    private final ArrayList<String> positiveKeywords;
    private final ArrayList<String> negativeKeywords;
    private final ArrayList<String> neutralKeywords;

    private boolean neutralOnPurpose = false;

    protected BooleanPrompt(String question) {
        super(question);

        positiveKeywords = new ArrayList<String>();
        negativeKeywords = new ArrayList<String>();
        neutralKeywords = new ArrayList<String>();

        positiveKeywords.add("yes");
        positiveKeywords.add("yeah");
        positiveKeywords.add("yup");
        positiveKeywords.add("sure");
        positiveKeywords.add("ok");
        positiveKeywords.add("kk");
        positiveKeywords.add("mkay");

        negativeKeywords.add("no");
        negativeKeywords.add("nah");
        negativeKeywords.add("dont");
        negativeKeywords.add("not really");
        negativeKeywords.add("bullshit");

        neutralKeywords.add("why would i");
        neutralKeywords.add("i dont know");
        neutralKeywords.add("hm");
        neutralKeywords.add("let me think");
        neutralKeywords.add("dunno");
    }

    @Override
    protected Boolean readAnswer() {
        final String answer = ConsoleInterface.readln();       // TODO: Change this to the Discord input, also at other prompts
        if (wordInList(neutralKeywords, answer))
            return true;
        else if (wordInList(negativeKeywords, answer))
            return false;
        else if (wordInList(positiveKeywords, answer))
            neutralOnPurpose = true;
        return null;
    }

    private boolean wordInList(ArrayList<String> a, String word) {      // Instead of "contains" function of Arraylist use of "contains" function of String
        for (String keyword : a) {
            if (keyword.contains(word.toLowerCase())) return true;
        }
        return false;
    }
}
