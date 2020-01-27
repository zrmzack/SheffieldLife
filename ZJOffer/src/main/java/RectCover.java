/**
 * @author zack
 * @create 2020-01-26-19:50
 */
public class RectCover {
    public static void main(String[] args) {

    }

    public int RectCover(int target) {
        if (target == 1 || target == 2) {
            return target;
        }
        return RectCover(target-1)+RectCover(target-2);

    }
}
