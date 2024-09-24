package baseball;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class GetNum {
    LinkedHashSet<Integer> getNum = new LinkedHashSet<Integer>();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    boolean validNum = false;
    int num;

    public int[] getNum(int count) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        getNum.clear();
        arrayList.clear();
        while (getNum.size() < count) {
            try {
                System.out.print("Enter number: ");
                num = sc.nextInt();
                getNum.add(num);
                validNum = true;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다 다시 입력하세요");
                sc.next();
                System.out.print("Enter number: ");
                num = sc.nextInt();
                getNum.add(num);
            }
        }
        int[] arr = new int[getNum.size()];

        arrayList.addAll(getNum);
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
