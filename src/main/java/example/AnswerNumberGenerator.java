package example;

import java.util.Random;

public class AnswerNumberGenerator implements NumberGenerator {

    @Override
    public String generateAnswer() {
        StringBuilder answer = new StringBuilder();
        Random random = new Random();

        while (answer.length() < 4) {
            int num = random.nextInt(10);
            if (!answer.toString().contains(String.valueOf(num)))
                answer.append(num);
        }
        //todo
//        Collections.shuffle();
        return answer.toString();
    }
}
