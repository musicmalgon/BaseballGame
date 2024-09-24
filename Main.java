package baseball;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        CreateAns ans = new CreateAns();
        GetNum getNum = new GetNum();
        StrikeAndBall strikeAndBall = new StrikeAndBall();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> cntList = new ArrayList<>();
        int count;
        int choice = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        while(choice != 3) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요\n" +
                    "1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Loop:
                    while (true) {
                        int cnt = 0;
                        Scanner sc = new Scanner(System.in);
                        System.out.print("난이도를 입력하세요: ");
                        count = sc.nextInt();
                        int[] answer = ans.createAns(count);
                        System.out.println("정답 생성 완료");
                        smallLoop:
                        while (true) {
                            cnt++;
                            int[] tryAns = getNum.getNum(count);
//                            strikeAndBall.strikeAndBall(count, answer, tryAns);
                            int strikeCount = strikeAndBall.strikeAndBall(count, answer, tryAns);

                            if (strikeCount == count) {
                                cntList.add(cnt);
                                cnt = 0;
                                sc.nextLine();
                                System.out.println("정답입니다 그만 두시겠습니까? yes/no");
                                String str = sc.nextLine();
                                if (Objects.equals(str, "yes")) {
                                    System.out.println("게임을 종료합니다");
                                    break Loop;
                                } else if (Objects.equals(str, "no")) {
                                    System.out.println("게임을 계속합니다");
                                    break smallLoop;
                                }
                            }
                            System.out.println("다시 시도하세요");
                        }
                    }
                    break;
                case 2:
                    for(int i =0; i<cntList.size();i++) {
                        System.out.println(i+1 + "번째 시도횟수: " + cntList.get(i));
                    }
                    break;
                case 3:
                    System.out.println("게임을 종료합니다");
                    break;
                default:
                    System.out.println("잘못된 숫자 입력");
                    break;
            }
        }
    }
}
