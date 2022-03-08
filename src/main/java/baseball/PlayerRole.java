package baseball;

import camp.nextstep.edu.missionutils.Console;

class playerNumber {
    int num1, num2, num3;
}

public class PlayerRole {
    int playerInput() {
        String inputString = Console.readLine();
        int intNum = Integer.parseInt(inputString);

        return intNum;
    }

    playerNumber splitIntNum (int intNum) {
        playerNumber pNum = new playerNumber();

        pNum.num1 = intNum / 100;
        pNum.num2 = (intNum - pNum.num1 * 100) / 10;
        pNum.num3 = intNum - (pNum.num1 * 100) - (pNum.num2 * 10);

        System.out.println(pNum.num1);
        System.out.println(pNum.num2);
        System.out.println(pNum.num3);

        return pNum;
    }
}
