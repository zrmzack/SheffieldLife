package Lab3;

/**
 * @author zack
 * @create 2019-11-11-22:12
 */
public class HotelRoom {
    private int RoomNumbers;
    private int price;
    private boolean isbooked;

    public int getRoomNumbers() {
        return RoomNumbers;
    }

    public void setRoomNumbers(int roomNumbers) {
        RoomNumbers = roomNumbers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIsbooked() {
        return isbooked;
    }

    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }
}
