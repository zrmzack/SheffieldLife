package SortAlgrithms;

/**
 * @author zack
 * @create 2020-04-20-0:04
 */
public class BubbleSort {
    public static void bubbleSort(int array[]) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
