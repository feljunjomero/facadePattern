public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Testing ===");
        frontDesk.pickUpVehicle("1A234U");
        frontDesk.cleanRoom(304);
        frontDesk.requestCart(2);
    }
}
