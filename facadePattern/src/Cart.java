public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Handling " +  numberOfCarts + " luggage cart/s");
    }
    @Override 
    public void doService() {
        System.out.println("Cart service done");
    }
}
