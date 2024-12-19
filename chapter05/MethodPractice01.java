package chapter05;

class BaseballPlayer {
    String name;
    double battingAverage;
    int homeRuns;
    static int playerCount;

    BaseballPlayer(String name, double battingAverage, int homeRuns) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.homeRuns = homeRuns;
        playerCount++;
    }

    void update(double newBattingAverage, int newHomeRuns) {
        battingAverage = newBattingAverage;
        homeRuns = newHomeRuns;
    }

    // === 정적 메서드 ===
    static String evaluateHomeRun(int homeRunCount) {
        if(homeRunCount > 20) {
            return "홈런상 후보에 등록됩니다";
        } else {
            return "홈런상 후보에 들어갈 수 없습니다";
        }
    }
}

public class MethodPractice01 {
    public static void main(String[] args) {
        BaseballPlayer baseballPlayer1 = new BaseballPlayer("이대호",0.4,2);
        BaseballPlayer baseballPlayer2 = new BaseballPlayer("강민호",0.2,3);
        BaseballPlayer baseballPlayer3 = new BaseballPlayer("아무나",0.5,4);
        BaseballPlayer baseballPlayer4 = new BaseballPlayer("홍길동",0.6,5);

        System.out.println("총 생성된 선수의 수 : " + BaseballPlayer.playerCount);

        baseballPlayer1.update(0.5,3);
        System.out.println(baseballPlayer1.battingAverage);
        System.out.println(baseballPlayer1.homeRuns);
        baseballPlayer2.update(0.5,3);
        baseballPlayer3.update(0.5,3);
        baseballPlayer4.update(0.5,3);

        System.out.println(BaseballPlayer.evaluateHomeRun(21));
        System.out.println(BaseballPlayer.evaluateHomeRun(19));
    }
}
