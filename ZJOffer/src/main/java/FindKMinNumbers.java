import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zack
 * @create 2020-02-01-18:25
 */
public class FindKMinNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length == 0 || k < 0 || k > input.length) {
            return arrayList;
        }
        Arrays.sort(input);
        for (int x = 0; x < k; x++) {
            arrayList.add(input[x]);
        }

        return arrayList;

    }
}
