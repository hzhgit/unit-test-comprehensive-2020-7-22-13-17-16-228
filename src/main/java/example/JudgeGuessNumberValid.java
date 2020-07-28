package example;

import java.util.Arrays;
import java.util.HashSet;

public class JudgeGuessNumberValid implements JudgeNumberValid{
    @Override
    public boolean judgeGuessValid(String numberString) {
        //TODO magic number,正则
        if(numberString.length() != 4 || !(numberString.matches("[0-9]+"))) {
            return false;
        }
        return new HashSet<>(Arrays.asList(numberString.split(""))).size() == 4;
    }
}
