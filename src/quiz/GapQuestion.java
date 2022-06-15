package quiz;

public class GapQuestion extends AbstractQuestion implements LeichteFrage {

    private final String answer;

    public GapQuestion(String text, String answer, int points) {
        super(text, points);
        this.answer = answer;
    }

    @Override
    public boolean verify(String input) {
        return answer.equalsIgnoreCase(input);
    }

    @Override
    public void print() {
        super.print();
        System.out.println();
        System.out.print("Ihre Eingabe: ");
    }

    @Override
    public int minusPunkte() {
        return 1;
    }
}
