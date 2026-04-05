class Swiggy {

    String restaurantName;
    int orderId;
    boolean isDelivered;
    int quantity;

    public Swiggy() {
	 System.out.println("Details");
    }

    public Swiggy(String restaurantName, int orderId, boolean isDelivered, int quantity) {
        this.restaurantName=restaurantName;
		this.orderId=orderId;
		this.isDelivered=isDelivered;
        this.quantity=quantity;
    }

    public void show() {
        System.out.println(restaurantName);
        System.out.println(orderId);
        System.out.println(isDelivered);
        System.out.println(quantity);
    }
}