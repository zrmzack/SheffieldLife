import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zack
 * @create 2020-01-31-1:38
 */
public class MoreThanHalf {
    public int moreThanHalf(int array[]) {
        int length = array.length;
        int half = length / 2;

        for (int x = 0; x < length; x++) {
            int temp = array[x];
            int times = 0;
            for (int y = 0; y < length; y++) {
                if (array[y] == temp) {
                    times++;
                    if (times > half) {
                        return array[y];
                    }
                }
            }
        }
        return 0;
    }

}
