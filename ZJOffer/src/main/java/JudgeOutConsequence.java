import java.util.ArrayList;
import java.util.Stack;

/**
 * @author zack
 * @create 2020-01-27-19:19
 */
public class JudgeOutConsequence {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length != popA.length||popA.length==0||pushA.length==0) {
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList();

        for(int i = 0,j = 0;i < pushA.length;i++){
            arrayList.add(pushA[i]);
            while(j < popA.length && arrayList.get(arrayList.size()-1) == popA[j]){
                arrayList.remove(arrayList.size()-1);
                j++;
            }
        }

        return arrayList.size()==0;
    }
}
