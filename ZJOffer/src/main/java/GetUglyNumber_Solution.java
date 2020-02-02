/**
 * @author zack
 * @create 2020-02-02-16:03
 */
public class GetUglyNumber_Solution {
    public static void main(String[] args) {
        GetUglyNumber_Solution g = new GetUglyNumber_Solution();
        System.out.println(g.GetUglyNumber_Solution(7));
    }

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int allNum = 0;
        int uglyFound = 0;
        while (uglyFound < index) {
            allNum++;
            if (isUglyNumber(allNum)) {
                ++uglyFound;
            }
        }
        return allNum;
    }

    public static boolean isUglyNumber(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        //所有除法完毕后应该等于1
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
