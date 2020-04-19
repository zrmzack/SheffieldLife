package ByteDance;

/**
 * @author zack
 * @create 2020-04-19-23:03
 */
public class reOrderArray {
    public static void reOrderArray(int[] array) {
        if (array.length == 0 || array == null) {
            return;
        }
        int count = 0;
        for (int i = 0; i < array.length && count < array.length; i++) {
            count++;
            int a = array[i];
            if (a % 2 == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = a;
                i--;
            }
        }
    }
}
