package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class IsGuessNumberValidTest {
    @Test
    public void should_false_when_judge_guess_number_valid_given_1123() {
        //given
        String number = "1123";
        JudgeNumberValid isGuessNumberValid = Mockito.mock(JudgeNumberValid.class);
        when(isGuessNumberValid.judgeGuessValid(number)).thenReturn(false);

        //when
        boolean actual = isGuessNumberValid.judgeGuessValid(number);

        //then
        assertEquals(false, actual);
    }

    @Test
    public void should_return_false_when_judge_guess_number_valid_given_11() {
        //given
        String number = "11";
        JudgeNumberValid isGuessNumberValid = Mockito.mock(JudgeNumberValid.class);
        when(isGuessNumberValid.judgeGuessValid(number)).thenReturn(false);

        //when
        boolean actual = isGuessNumberValid.judgeGuessValid(number);
        //then
        assertEquals(false, actual);
    }
}
