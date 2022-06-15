package quiz;

public class SingleChoiceQuestion extends AbstractQuestion implements SchwereFrage {
    private Choice[] choices = new Choice[4];
    private int choiceCount = 0;

    public SingleChoiceQuestion(String text, int points) {
        super(text, points);
    }

    public void addChoice(Choice choice) {
        choices[choiceCount] = choice;
        choiceCount ++;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println();
        for (int i = 0; i < choiceCount; i++) {
            System.out.printf("%d: %s\n", (i+1), choices[i].getText());
        }
    }

    @Override
    public boolean verify(String input) {
        int index = Integer.parseInt(input) - 1;
        return choices[index].isCorrect();
    }

    @Override
    public int zusatzPunkte() {
        return choiceCount * 2;
    }
}
