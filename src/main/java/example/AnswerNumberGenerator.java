package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AnswerNumberGenerator implements NumberGenerator {

    private static final int ANSWER_STRING_LENGTH = 4;

    @Override
    public String generateAnswer() {
        StringBuilder answer = new StringBuilder();

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List numberList = new ArrayList();
        for (int index = 0; index < numbers.length; index++) {
            numberList.add(numbers[index]);
        }
        Collections.shuffle(numberList);

        for (int index = 0; index < ANSWER_STRING_LENGTH; index++){
            answer.append(numberList.get(index));
        }

        return answer.toString();
    }
}
