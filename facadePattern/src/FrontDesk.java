public class FrontDesk {
    private Housekeeping housekeeping;
    private Cart cart;
    private Valet valet;

    public FrontDesk() {
        this.valet = new Valet();
        this.cart = new Cart();
        this.housekeeping = new Housekeeping();
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }
    public void cleanRoom(int roomNumber){
        housekeeping.cleanRoom(roomNumber);
    }
    public void requestCart(int numberOfCarts){
        cart.requestCart(numberOfCarts);
    }

}
