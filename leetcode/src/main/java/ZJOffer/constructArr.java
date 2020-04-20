package ZJOffer;

/**
 * @author zack
 * @create 2020-04-21-3:07
 */
public class constructArr {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        array = constructArr.constructArr(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] constructArr(int[] a) {
        int n = a.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= a[i], i++)       /* 从左往右累乘 */ {
            B[i] = product;
        }
        for (int i = n - 1, product = 1; i >= 0; product *= a[i], i--)  /* 从右往左累乘 */ {
            B[i] *= product;
        }
        return B;
    }
}
