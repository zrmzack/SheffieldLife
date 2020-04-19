package ByteDance;

/**
 * @author zack
 * @create 2020-04-19-18:48
 */
public class HouseRober {
    public int rob(int[] nums) {
        int cur = 0;
        int pre = 0;
        for (int x : nums) {
            int temp = cur;
            cur = Math.max(pre + x, cur);
            pre = temp;
        }
        return cur;
    }
}
