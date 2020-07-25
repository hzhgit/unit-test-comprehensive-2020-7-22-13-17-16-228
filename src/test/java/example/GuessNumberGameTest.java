package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_answer_is_1234_given_1234() {
        //given
        String guess = "1234";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("4A0B", actual);
    }

    @Test
    public void should_return_0A0B_when_answer_is_1234_given_5678() {
        //given
        String guess = "5678";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("0A0B", actual);
    }

    @Test
    public void should_return_2A2B_when_answer_is_1234_given_1243() {
        //given
        String guess = "1243";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("2A2B", actual);
    }

    @Test
    public void should_return_1A1B_when_guess_given_is_1025_and_answer_1234() {
        //given
        String guess = "1025";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("1A1B", actual);
    }

    @Test
    public void should_return_0A4B_when_guess_given_is_4321_and_answer_1234() {
        //given
        String guess = "4321";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("0A4B", actual);
    }

    @Test
    public void should_return_0A2B_when_guess_given_is_2107_and_answer_1234() {
        //given
        String guess = "2107";
        String answer = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        //when
        String actual = guessNumberGame.guess(guess);

        //then
        assertEquals("0A2B", actual);
    }

    @Test
    void should_return_true_when_generate_number_given_not_repeat() {
        //given
        NumberGenerator numberGenerator = Mockito.mock(NumberGenerator.class);
        when(numberGenerator.generateAnswer()).thenReturn("1234");
        String generatedResult = numberGenerator.generateAnswer();

        //when
        int actual = new HashSet<String>(Arrays.asList(generatedResult.split(""))).size();

        //then
        assertEquals(4, actual);
    }
}
