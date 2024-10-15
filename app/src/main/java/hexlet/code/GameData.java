package hexlet.code;

import static hexlet.code.Engine.ROUNDS;

public final class GameData {
    private static String rules;
    private static String[][] gameData = new String[ROUNDS][2];
    private static String userName;


    public void setRules(String rules) {
        this.rules = rules;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setGameData(int roundNum, String question, String answer) {
        gameData[roundNum][0] = question;
        gameData[roundNum][1] = answer;
    }
    public String getRules() {
        return rules;
    }

    public String getUserName() {
        return userName;
    }

    public String getQuestion(int roundNum) {
        return gameData[roundNum][0];
    }
    public String getAnswer(int roundNum) {
        return gameData[roundNum][1];
    }
}