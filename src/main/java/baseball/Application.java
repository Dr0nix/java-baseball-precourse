package baseball;

import java.util.Arrays;
import java.util.List;

class playerNumber {
    int num1, num2, num3;
}

public class Application {
    public static void main(String[] args) {
        ComputerRole cpuRole = new ComputerRole();
        Judge judge = new Judge();

        List<Integer> cpuNum = cpuRole.createCpuNumber();
        List<Integer> ballcount = Arrays.asList(0,0);

        while (true) {
            ballcount.set(0,0);
            ballcount.set(1,0);
            judge.judgeBallcount(ballcount, cpuNum);
            int finish = judge.printBallCount(ballcount);

            if (finish != 0) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
                break;
            }
        }
    }
}

