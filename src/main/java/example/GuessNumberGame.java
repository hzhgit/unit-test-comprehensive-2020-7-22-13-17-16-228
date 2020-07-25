package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        int rightNumber = getRightNumber(guess);
        int rightPositionNumber = getRightPositionNumber(guess);

        return rightPositionNumber + "A" + (rightNumber - rightPositionNumber) + "B";
    }

    private int getRightNumber(String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j< guess.length(); j++) {
                if(guess.charAt(i) == this.answer.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getRightPositionNumber(String guess) {
        int count = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == this.answer.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
