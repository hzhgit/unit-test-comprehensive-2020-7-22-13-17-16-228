package example;

import java.util.Arrays;
import java.util.HashSet;

public class JudgeGuessNumberValid implements JudgeNumberValid{
    @Override
    public boolean judgeGuessValid(String number) {
        if(number.length() != 4 || !(number.matches("[0-9]+"))) {
            return false;
        }
        return new HashSet<>(Arrays.asList(number.split(""))).size() == 4;
    }
}
