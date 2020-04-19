package test;

/**
 * @author zack
 * @create 2020-04-02-5:24
 */
public class SizeTest {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 6};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                flag = true;
                break;
            }
        }
        System.out.println("jieshu");
    }
}
