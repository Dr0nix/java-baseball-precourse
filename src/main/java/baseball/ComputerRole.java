package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class ComputerRole {
    List<Integer> createCpuNumber() {
        List<Integer> cpuNum = Arrays.asList(0, 0, 0);
        for (int i = 0; i < 3; i++) {
            int temp = Randoms.pickNumberInRange(1,9);
            if (cpuNum.contains(temp)) {
                i--;
                continue;
            } else {
                cpuNum.set(i,temp);
            }
        }
        return cpuNum;
    }



    void printNumber(List<Integer> cpuNum) {
        System.out.println(cpuNum.get(0));
        System.out.println(cpuNum.get(1));
        System.out.println(cpuNum.get(2));
    }
}
