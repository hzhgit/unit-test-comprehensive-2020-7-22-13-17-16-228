package example;

import java.util.Arrays;
import java.util.HashSet;

public class JudgeGuessNumberValid implements JudgeNumberValid{

    private static final String REGULAR_EXPRESSION_FOR_A_NUMBER_STRING = "[0-9]+";
    private static final int DEFAULT_NUMBER_STRING_LENGTH = 4;

    @Override
    public boolean judgeGuessValid(String numberString) {
        if(numberString.length() != 4 || !(numberString.matches(REGULAR_EXPRESSION_FOR_A_NUMBER_STRING))) {
            return false;
        }
        return new HashSet<>(Arrays.asList(numberString.split(""))).size() == DEFAULT_NUMBER_STRING_LENGTH;
    }
}
