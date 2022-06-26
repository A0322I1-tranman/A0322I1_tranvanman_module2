package BT;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name,int scorePlayer1, int scorePlayer2){
        String score = "";
        int tempScore = 0;
        if (scorePlayer1==scorePlayer2){
            score = firstPlayer1(scorePlayer1);
        }else if (scorePlayer1>=4||scorePlayer2>=4){
            score = scoreLast(scorePlayer1,scorePlayer2);
        }else{
            for (int i=1;i<3;i++){
                if (i==1){
                    tempScore = scorePlayer1;
                }else {
                    score+="-";
                    tempScore = scorePlayer2;
                }
                score = secondPlayer2(scorePlayer2);
            }
        }
        return score;
    }
    public static String scoreLast(int scorePlayer1, int scorePlayer2){
        String score = "";
        int minusResult = scorePlayer1-scorePlayer2;
        if (minusResult==1){
            score = "Advantage player1";
        }else if (minusResult == -1){
            score = "Advantage player2";
        }else if (minusResult >=2){
            score = "Win for player1";
        }else {
            score = "Win for player2";
        }
        return score;
    }
    public static String firstPlayer1(int scorePlayer1){
        String score = "";
        switch (scorePlayer1){
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }


    public static String secondPlayer2(int scorePlayer2){
        String score = "";
        switch (scorePlayer2){
            case 0:
                score+="Love";
                break;
            case 1:
                score+="Fifteen";
                break;
            case 2:
                score+="Thirty";
                break;
            case 3:
                score+="Forty";
                break;
        }
        return score;


    }

    public static void main(String[] args) {
        System.out.println(getScore("Nam","Nhân",5,1));
    }
}
