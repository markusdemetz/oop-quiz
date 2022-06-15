package quiz;

import java.util.Scanner;

public class LeichtesQuiz {
    private final Scanner scanner;
    private LeichteFrage[] fragen;

    public LeichtesQuiz(Scanner scanner) {
     this.scanner = scanner;
    }

    public void initFragen() {
        fragen = new LeichteFrage[] {
                new YesNoQuestion("Heute ist Mittwoch", 10,true),
                new GapQuestion("Heute ist ________", "Mittwoch", 10)
        };
    }

    public void start() {
        int points = 0;
        for (LeichteFrage frage : fragen) {
            frage.zeigeFrage();
            if (frage.verify(scanner.nextLine())) {
                 points += frage.getPoints();
            } else {
                 points -= frage.minusPunkte();
            }
        }
        System.out.println("Erreichte Punkte: " + points);
    }
}
