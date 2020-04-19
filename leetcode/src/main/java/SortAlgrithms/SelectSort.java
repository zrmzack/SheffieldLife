package SortAlgrithms;

/**
 * @author zack
 * @create 2020-04-20-0:21
 */
public class SelectSort {
    public static void selectsort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minindex = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    //重置min
                    min = array[j];
                    //重置minindex
                    minindex = j;
                }
            }
            //概论循环结束后，把最小值放道当前循环第一个(交换)
            if (minindex != 0) {
                array[minindex] = array[i];
                array[i] = min;
            }

        }
    }
}
