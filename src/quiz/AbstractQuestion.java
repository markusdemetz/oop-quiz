package quiz;

public abstract class AbstractQuestion implements Question {
    private String text;
    private int points;

    public AbstractQuestion(String text, int points) {
        this.text = text;
        this.points = points;
    }

    @Override
    public void zeigeFrage() {
        print();
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }

    protected void print(){
        System.out.print(text);
    }

    public abstract boolean verify(String input);
}
