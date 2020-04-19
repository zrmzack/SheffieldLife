package AliBaBa;

/**
 * @author zack
 * @create 2020-04-08-16:02
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //输入T
        int T = in.nextInt();
        //输入有误
        if (T < 1 || T > 10000) {
            return;
        }
        //循环输入n m a b
        int n = 0, m = 0, a = 0, b = 0;
        for (int i = 0; i < T; i++) {
            n = in.nextInt();
            m = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
        }
        //草人个数
        int arrayNumber[] = new int[m];
        //初始化血量
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = a;
        }
        System.out.println(DPAttack(b, arrayNumber, n));
    }

    /**
     * @param b           攻击距离
     * @param arrayNumber 草人个数和初始血量
     * @param totalTime   总共训练时间
     * @return 攻击的到草人个数
     */
    public static int DPAttack(int b, int arrayNumber[], int totalTime) {
//        //总共攻击次数
//        int totalAttackTimes = b * totalTime;
//        //总血量
//        int totalBlood = arrayNumber[0] * arrayNumber.length;
//        //攻击完
//        if (totalBlood / totalAttackTimes == 1) {
//            return arrayNumber.length;
//        }
//        int number = 0;
//        //平均攻击完
//        number= (totalAttackTimes / arrayNumber[0]);
//        return number;

        for (int i = 0; i < totalTime; i++) {
            for (int j = 0; j < b; j++) {
                if (arrayNumber[j] >= 1) {
                    arrayNumber[j] -= 1;
                }
            }
        }
        //统计攻击完后的稻草人个数
        int temp = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == 0) {
                temp++;
            }
        }
        return temp;
    }
}
