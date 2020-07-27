package example;

import java.util.Scanner;

public class GuessNumberGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnswerNumberGenerator answerNumberGenerator = new AnswerNumberGenerator();
        String answer = answerNumberGenerator.generateAnswer();
        JudgeGuessNumberValid judgeGuessNumberValid = new JudgeGuessNumberValid();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        System.out.println("answer : " + answer);

        int count = 0;
        while(sc.hasNextLine()){
            String guess = "";
            guess += sc.next();
            count++;
            if(judgeGuessNumberValid.judgeGuessValid(guess)){
                String result = guessNumberGame.guess(guess);
                if(result.equals("4A0B")){
                    System.out.println(result);
                    break;
                }else{
                    System.out.println(result);
                }
            }else{
                System.out.println("Wrong Input£¬Input again");
            }

            if(count == 6)
                break;
        }
    }
}
