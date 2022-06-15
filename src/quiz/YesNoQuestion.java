package quiz;

import java.util.Locale;

public class YesNoQuestion extends Question {

    private boolean correct;

    public YesNoQuestion(String text, int points, boolean correct) {
        super(text, points);
        this.correct = correct;
    }

    @Override
    public boolean verify(String input) {
        switch(input.toLowerCase(Locale.ROOT).trim()) {
            case "j":
            case "y":
            case "ja":
            case "yes":
            case "t":
            case "true":
                return correct;
            default:
                return !correct;
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" J(a) / N(ein) ?");
    }
}
