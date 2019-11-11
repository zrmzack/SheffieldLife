package Lab4;

import java.util.Scanner;

/**
 * @author zack
 * @create 2019-11-11-22:12
 */
public class HotelManagerSimulator {
    public static void main(String[] args) {
        System.out.println("input your max price");
        int max = new Scanner(System.in).nextInt();
        System.out.println("input your min price");
        int min = new Scanner(System.in).nextInt();
        System.out.println("How many days do you want to print");
        int days = new Scanner(System.in).nextInt();
        Hotel hotel = new Hotel();
        hotel.printmessage(max, min);
        hotel.printdays(days,max,min);
    }
}
