/**
 * @author zack
 * @create 2020-02-02-17:19
 */
public class InversePairs {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,0};
        InversePairs inversePairs=new InversePairs();
        System.out.println(inversePairs.InversePairs(array));
    }
    public int InversePairs(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int pairs=0;
        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array.length; y++) {
                if (array[y]<array[i]){
                    pairs+=1;
                }
            }
        }
        return pairs;
    }
}
