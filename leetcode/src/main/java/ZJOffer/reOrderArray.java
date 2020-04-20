package ZJOffer;

import java.util.LinkedList;

/**
 * @author zack
 * @create 2020-01-27-6:59
 */
public class reOrderArray {
    public void reorderarray(int[] array) {
        LinkedList<Integer> tempArrJi = new LinkedList<>();
        LinkedList<Integer> tempArrOu = new LinkedList<>();
        LinkedList<Integer> tempArrTotal = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                tempArrJi.add(array[i]);
            } else {
                tempArrOu.add(array[i]);
            }
        }
        for (int i = 0; i < tempArrOu.size(); i++) {
            tempArrJi.add(tempArrOu.get(i));
        }
        for (int i = 0; i <tempArrJi.size() ; i++) {
            array[i]=tempArrJi.get(i);
        }
    }
}
