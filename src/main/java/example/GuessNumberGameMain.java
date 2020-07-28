package example;

import java.util.Scanner;

public class GuessNumberGameMain {

    private static final String CORRECT_MESSAGE = "4A0B";
    private static final int MAX_GUESS_TIMES = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnswerNumberGenerator answerNumberGenerator = new AnswerNumberGenerator();
        String answer = answerNumberGenerator.generateAnswer();
        JudgeGuessNumberValid judgeGuessNumberValid = new JudgeGuessNumberValid();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        System.out.println("answer : " + answer);

        int count = 0;
        while (scanner.hasNextLine()) {
            String guess = "";
            guess += scanner.next();
            count++;
            if (judgeGuessNumberValid.judgeGuessValid(guess)) {
                String result = guessNumberGame.guess(guess);
                if (result.equals(CORRECT_MESSAGE)) {
                    System.out.println(result);
                    break;
                } else {
                    System.out.println(result);
                }
            } else {
                System.out.println("Wrong Input£¬Input again");
            }
            if (count == MAX_GUESS_TIMES)
                break;
        }
    }
}
