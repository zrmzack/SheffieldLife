/**
 * @author zack
 * @create 2020-01-26-2:13
 */
public class TwoArraysFind {

    public static void main(String[] args) {
        int a[][] = {
                {
                        1, 2, 8, 9
                },
                {
                        2, 4, 9, 12
                },
                {
                        4, 7, 10, 13
                },
                {
                    6, 8, 11, 15
                },
        };
       System.out.println( Find(7,a));
    }

    public static void testGetXY(int[][] array) {
        int x = array.length;
        int y = array[0].length;
        System.out.println(x);
        System.out.println(y);

    }

    public static boolean Find(int target, int[][] array) {
        //get rows
        int x = array.length;
        //get cloums
        int y = array[0].length;
        if (array == null || target > Integer.MAX_VALUE || target < Integer.MIN_VALUE) {
            return false;
        }
        int tempx = 0;
        int tempy = y-1;
        while (tempx < x && tempy >= 0) {
            if (array[tempx][tempy] == target) {
                return true;
            } else if (array[tempx][tempy] > target) {
                tempy--;
            } else if (array[tempx][tempy] < target) {
                tempx++;
            }
        }
        return false;
    }
}
