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
        JudgeGuessNumberValid isGuessNumberValid = Mockito.mock(JudgeGuessNumberValid.class);
        when(isGuessNumberValid.judgeGuessValid()).thenReturn(false);

        //when
        boolean actual = isGuessNumberValid.judgeGuessValid();

        //then
        assertEquals(false, actual);
    }
}
