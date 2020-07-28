package example;

public class GuessNumberGame {
    private static final String CORRECT_NUMBER_COUNT = "A";
    private static final String CORRECT_POSTION_COUNT = "B";
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        int rightNumber = getRightNumberCount(guess);
        int rightPositionNumber = getRightPositionNumberCount(guess);
        return rightPositionNumber + CORRECT_NUMBER_COUNT + (rightNumber - rightPositionNumber) + CORRECT_POSTION_COUNT;
    }

    private int getRightNumberCount(String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < guess.length(); j++) {
                if (guess.charAt(i) == this.answer.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getRightPositionNumberCount(String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == this.answer.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
