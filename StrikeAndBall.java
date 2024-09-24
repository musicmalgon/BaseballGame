package baseball;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class StrikeAndBall {
    int strikeCounter;
    int ballCounter;
    public int strikeAndBall(int count, int[] ans, int[] tryAns) {
        strikeCounter = 0;
        ballCounter = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[i] == tryAns[j]) {
                    if (i == j) {
                        strikeCounter++;
                    } else {
                        ballCounter++;
                    }
                }
            }
        }
        System.out.println("스트라이크 갯수: " + strikeCounter);
        System.out.println("볼 갯수: " + ballCounter);
        if (strikeCounter == 0 && ballCounter == 0) {
            System.out.println("일치하는 조건이 없습니다");
        }
        if (strikeCounter == count) {
            System.out.println(count+" Strike!!!");
        }
        return strikeCounter;
    }
}

