package baseball;

import java.util.List;

public class Judge {
    void strikeCountUP(List<Integer> ballcount) {
        ballcount.set(1, ballcount.get(1) + 1);
    }

    void ballCountUp(List<Integer> ballcount) {
        ballcount.set(0, ballcount.get(0) + 1);
    }

    void judgeBallcount(List<Integer> ballcount, List<Integer> cpuNum) {
        PlayerRole plyRole = new PlayerRole();

        int intNum = plyRole.playerInput();
        playerNumber pNum = plyRole.splitIntNum(intNum);

        if (pNum.num1 == cpuNum.get(0)) {
            strikeCountUP(ballcount);
        } else if (cpuNum.contains(pNum.num1)) {
            ballCountUp(ballcount);
        }

        if (pNum.num2 == cpuNum.get(1)) {
            strikeCountUP(ballcount);
        } else if (cpuNum.contains(pNum.num2)) {
            ballCountUp(ballcount);
        }

        if (pNum.num3 == cpuNum.get(2)) {
            strikeCountUP(ballcount);
        } else if (cpuNum.contains(pNum.num3)) {
            ballCountUp(ballcount);
        }
    }

    int printBallCount(List<Integer> ballcount) {
        int finish = 0;
        if (ballcount.get(0) == 0 && ballcount.get(1) == 0){
            System.out.println("낫싱");
        } else if (ballcount.get(1) == 0 && ballcount.get(0) !=0) {
            System.out.printf("%d볼\n",ballcount.get(0));
        } else if (ballcount.get(0) == 0 && ballcount.get(1) !=0) {
            System.out.printf("%d스트라이크\n",ballcount.get(1));
        } else {
            System.out.printf("%d볼 %d스트라이크\n",ballcount.get(0),ballcount.get(1));
        }

        if (ballcount.get(1) == 3) {
            finish = 100;
        }

        return finish;
    }
}
