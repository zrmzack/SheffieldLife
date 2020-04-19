package SortAlgrithms;

/**
 * @author zack
 * @create 2020-04-20-0:56
 */
public class InsertSort {
    public static void InsertSort(int[] arr) {
        int insertVal = arr[1];
        int indexIndex = 1 - 1;
        //说明找到了要插入的数字了
        while (indexIndex >= 0 && insertVal < arr[indexIndex]) {
            arr[indexIndex + 1] = arr[indexIndex];
            indexIndex--;
        }
        //当推出当前循环的时候，插入的位置找到了
        arr[indexIndex + 1] = insertVal;
    }
}
