package example;

import java.util.Random;

public class AnswerNumberGenerator implements NumberGenerator {

    @Override
    public String generateAnswer() {
        String answer = "";
        Random random = new Random();

        while (answer.length() < 4) {
            int num = random.nextInt(10);
            if (answer.indexOf(String.valueOf(num)) < 0)
                answer += String.valueOf(num);
        }
        return answer;
    }
}