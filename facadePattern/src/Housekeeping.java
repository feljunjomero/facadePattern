public class Housekeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room no. " + roomNumber);
    }
    @Override 
    public void doService() {
        System.out.println("Housekeeping service done");
    }
}
