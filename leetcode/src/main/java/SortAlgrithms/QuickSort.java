package SortAlgrithms;

/**
 * @author zack
 * @create 2020-04-20-1:10
 */
public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        //交换的时候使用
        int temp = 0;
        //比pivot小的放左边，
        //大的放右边
        while (l < r) {
            //在pivot左边一直找，找到大于等于povot,才退出
            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }
            //如果l>=r,说明povot的左右两边全部都是  小于等于或者大于等于pivot的值了
            if (l >= r) {
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            //如果交换完后，发现arr[l]==pivot相等， r--
            if (arr[l] == pivot) {
                r -= 1;
            }
            //如果交换完后，发现arr[r]==pivot相等， l++
            if (arr[r] == pivot) {
                l += 1;
            }
        }
        //如果l==r,l++,r--
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            quickSort(arr, left, r);
        }
        if (right > l) {
            quickSort(arr, l, right);
        }
    }
}
