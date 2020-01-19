package sparsearray;

/**
 * @author zack
 * @create 2020-01-08-13:15
 */
public class SparseArray {
    public static void main(String[] args) {
        //初始化一个二维数组
        int cheess[][] = new int[11][11];
        cheess[1][2] = 1;
        cheess[2][3] = 2;
        for (int[] row : cheess) {
            for (int data : row) {
                //打印这个数组
                System.out.print(data + " ");
            }
            System.out.println();
        }
        //change to simple array
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                //统计有几个不为0的二维数组个数
                if (cheess[i][j] != 0) {
                    sum++;
                }
            }
        }
        int newArray[][] = new int[sum + 1][3];
        newArray[0][0] = 11;
        newArray[0][1] = 11;
        newArray[0][2] = sum;

        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (cheess[i][j] != 0) {
                    count++;
                    newArray[count][2] = cheess[i][j];
                    newArray[count][0] = i;
                    newArray[count][1] = j;
                }
            }
        }

        System.out.println("--------------------------");
        for (int[] array : newArray) {
            for (int data : array) {
                System.out.print(data + " ");
            }
            System.out.println();
        }


        int newArray2[][] = new int[newArray[0][0]][newArray[0][1]];
        for (int i = 1; i < newArray.length; i++) {
            newArray2[newArray[i][0]][newArray[i][1]] = newArray[i][2];
        }
        System.out.println("-----------------");
        for (int[] array : newArray2) {
            for (int data : array) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
