class TeddyBear_Runner {

    public static void main(String[] args) {

        TeddyBear.storeName();

        TeddyBear.customer("Anu");

        int bearPrice = TeddyBear.getPrice();
        System.out.println("Teddy Bear Price: " + bearPrice);

        int finalAmount = TeddyBear.totalAmount(bearPrice);
        System.out.println("Total Amount: " + finalAmount);
    }
}