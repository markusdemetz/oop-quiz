package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private List<Question> questions = new ArrayList<>();
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        LeichtesQuiz leichtesQuiz = new LeichtesQuiz(sc);

        /*Quiz quiz = new Quiz();
        quiz.initQuestions();
        quiz.start();*/

        sc.close();
    }

    private void start() {
        int points = 0;

        for (Question question : questions) {
            question.zeigeFrage();
            if (question.verify(sc.nextLine())) {
                points += question.getPoints();
            }
        }
        System.out.println("Points: " + points);
    }

    private void initQuestions() {
        SingleChoiceQuestion q1 = new SingleChoiceQuestion("Welche Aussage ist wahr?", 5);
        q1.addChoice(new Choice("Heute ist Mittwoch", true));
        q1.addChoice(new Choice("Heute ist Sonntag", false));
        q1.addChoice(new Choice("Heute ist Freitag", false));

        YesNoQuestion ynq = new YesNoQuestion("Java ist statisch typisiert.", 5, true);
        GapQuestion gq = new GapQuestion("Heute ist ________", "Mittwoch", 5);

        this.questions.add(q1);
        this.questions.add(ynq);
        this.questions.add(gq);
    }
}
