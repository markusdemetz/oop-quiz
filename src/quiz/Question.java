package quiz;

public interface Question {

    int MAX_QUESTIONS = 100;

    void zeigeFrage();
    int getPoints();
    boolean verify(String input);

    default void checkSomething(String input) {
        System.out.println(input);
        verify(input);
        printSomething();
    }

    private void printSomething() {
        System.out.println("Something");
    }

    static Question[] createQuestions() {
        return new Question[0];
    }

}
