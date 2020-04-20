package ZJOffer;

/**
 * @author zack
 * @create 2020-02-01-18:33
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int cur = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (cur > 0) {
                cur = cur + array[i];
            } else {
                cur=array[i];
            }
            if (max < cur) {
                max = cur;
            }
        }
        return max;
    }
}
