package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberGameTest {
    @Test
    public void should_4A0B_when_answer_is_1234_given_1234() {
        //given
        String number = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame();

        //when
        String actual = guessNumberGame.guess(number);

        //then
        assertEquals("4A0B",actual);
    }
}
