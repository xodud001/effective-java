package chapter2.item8;

public class Adult {
    public static void main(String[] args) {
        try(Room myRoom = new Room(7)){
            System.out.println("하윙~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
