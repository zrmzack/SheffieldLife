package AliBaBa;

/**
 * @author zack
 * @create 2020-04-02-5:13
 * 一副扑克牌，总共有 A 2 3 4 5 6 7 8 9 每张牌各4张，从中抽取任意张牌，牌可以有四种出法
 * 单张牌，比如说 A
 * 一对牌，比如说 两个2
 * 五张牌顺子，比如说 A 2 3 4 5
 * 六张牌连对，比如说 A A 2 2 3 3
 * 现在输入是10种牌每张牌的个数，如 1 1 1 2 2 2 2 2 1 1 ，指的是这10张牌每张的个数，现在问最少出几次能把牌出完。
 * 此时的解答是3次，出3个顺子可以达到目标。
 */


public class ChuPai {
    public static int min = Integer.MAX_VALUE;

    public static boolean check(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void dfs(int[] nums, int count) {
        //剪枝
        if (count > min) {
            return;
        }
        if (check(nums)) {
            int i = 0;
            while (nums[i] == 0) {
                i++;
            }
            //单张
            if (nums[i] > 0) {
                nums[i]--;
                dfs(nums, count + 1);
                nums[i]++;
            }
            //对子
            if (nums[i] > 1) {
                nums[i] -= 2;
                dfs(nums, count + 1);
                nums[i] += 2;
            }
            //五连
            if (i + 5 <= nums.length && nums[i] > 0 && nums[i + 1] > 0 && nums[i + 2] > 0 && nums[i + 3] > 0 && nums[i + 4] > 0) {
                for (int j = 0; j < 5; j++) {
                    nums[i + j]--;
                }
                dfs(nums, count + 1);
                for (int j = 0; j < 5; j++) {
                    nums[i + j]++;
                }
            }
            //三双
            if (i + 3 <= nums.length && nums[i] > 1 && nums[i + 1] > 1 && nums[i + 2] > 1) {
                nums[i] -= 2;
                nums[i + 1] -= 2;
                nums[i + 2] -= 2;
                dfs(nums, count + 1);
                nums[i] += 2;
                nums[i + 1] += 2;
                nums[i + 2] += 2;
            }
        } else {
            if (count < min) {
                min = count;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 2, 2, 2, 1, 1};
        dfs(nums, 0);
        System.out.println(min);
    }
}
