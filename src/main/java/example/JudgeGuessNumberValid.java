package example;

import java.util.Arrays;
import java.util.HashSet;

public class JudgeGuessNumberValid implements JudgeNumberValid{
    @Override
    public boolean judgeGuessValid(String number) {
        return new HashSet<>(Arrays.asList(number.split(""))).size() == 4;
    }
}
