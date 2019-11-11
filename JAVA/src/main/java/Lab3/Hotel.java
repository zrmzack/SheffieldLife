package Lab3;

import java.util.Random;

/**
 * @author zack
 * @create 2019-11-11-22:12
 */
public class Hotel {
    int max;
    int min;
    int totalprice;
    HotelRoom hotelRooms[] = new HotelRoom[100];

    public void initrooms() {
        for (int x = 0; x < hotelRooms.length; x++) {
            HotelRoom hotelRoom = new HotelRoom();
            hotelRooms[x] = hotelRoom;
            hotelRooms[x].setIsbooked(true);
            hotelRooms[x].setPrice(0);
            hotelRooms[x].setRoomNumbers(x);
        }
    }

    public int getprice(int max, int min) {
        this.max = max;
        this.min = min;
        Random random = new Random();
        int price = random.nextInt(max - min) + min;
        return price;
    }

    public void setcommonroom(int max, int min) {
        for (int x = 0; x < 20; x++) {
            hotelRooms[x].setPrice(getprice(max, min));
        }
    }

    public int getHighPrice(int max, int min) {
        int temp = hotelRooms[0].getPrice();
        for (int x = 0; x < 20; x++) {
            if (hotelRooms[x].getPrice() > temp) {
                temp = hotelRooms[x].getPrice();
            }
        }
        return temp;
    }

    public HotelRoom getCoachRoom(int max, int min) {
        initrooms();
        setcommonroom(max, min);
        int roomnumber = new Random().nextInt(100);
        HotelRoom hotelRoom = new HotelRoom();
        hotelRooms[roomnumber] = hotelRoom;
        hotelRooms[roomnumber].setRoomNumbers(roomnumber);
        hotelRooms[roomnumber].setIsbooked(true);
        hotelRooms[roomnumber].setPrice(getHighPrice(max, min) + 1);
        if (roomnumber >= 0 || roomnumber <= 18) {
            hotelRooms[roomnumber].setPrice(getHighPrice(max, min) + 1);
        }
        return hotelRoom;
    }

    public void printmessage(int max, int min) {
        HotelRoom hotelcoach = getCoachRoom(max, min);
        if (hotelcoach.getRoomNumbers() > 18) {
            for (int x = 0; x < 19; x++) {
                System.out.println("Roomnuber : " + x + "; price " + hotelRooms[x].getPrice() + "; isbooked?" + hotelRooms[x].isIsbooked());
            }
            System.out.println("Roomnuber : " + hotelcoach.getRoomNumbers() + "; price " + hotelcoach.getPrice() + "; isbooked?" + getCoachRoom(max, min).isIsbooked());
        } else {
            for (int x = 0; x < 20; x++) {
                if (x != hotelcoach.getRoomNumbers()) {
                    System.out.println("Roomnuber : " + x + "; price " + hotelRooms[x].getPrice() + "; isbooked?" + hotelRooms[x].isIsbooked());
                }
                if (x == hotelcoach.getRoomNumbers()) {
                    System.out.println();
                }
            }
            System.out.println("Roomnuber : " + hotelcoach.getRoomNumbers() + "; price " + hotelcoach.getPrice() + "; isbooked?" + hotelcoach.isIsbooked());
        }
    }

    public int getsum() {
        totalprice = 0;
        for (int x = 0; x < 100; x++) {
            totalprice += hotelRooms[x].getPrice();
        }
        return totalprice;
    }

    public void printdays(int days, int max, int min) {
        if (days == 1) {
            System.out.println("Total price is : " + getsum());
        } else {
            for (int x = 1; x <= days; x++) {
                setcommonroom(max, min);
                getCoachRoom(max, min);
                System.out.println("Day : " + (x - 1) + "; All price " + getsum());
            }
        }
    }
}
