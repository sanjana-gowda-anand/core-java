class TeddyBear {

    static void storeName() {
        String message="Welcome to Teddy Bear Gift Shop";
        System.out.println(message);
    }

    static void customer(String name) {
        String text = "Customer buying teddy:"+name;
        System.out.println(text);
    }

    static int getPrice() {
        int cost=300;
        int tax=50;
        int price=cost+tax;
        return price;
    }

    static int totalAmount(int price) {
        int packingCharge=50;
        int amount=price+packingCharge;
        return amount;
    }
}