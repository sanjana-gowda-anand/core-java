class Shoes {

    public static void main(String[] args) {

        System.out.println("Welcome to Shoes Store");
        getShoes();

        int nikePrice = 2500;
        int adidasPrice = 3000;
        String message = "TOTAL SHOES PRICE";

        calculatePrice(nikePrice, adidasPrice, message);

        double discount = getDiscount();
        System.out.println(discount);
    }

    static void getShoes() {
        System.out.println("This is Shoes Store");
    }

    static void calculatePrice(int nikePrice, int adidasPrice, String message) {
        int total = nikePrice + adidasPrice;
        System.out.println(total);
        System.out.println(message);
    }

    static double getDiscount() {
        double discount = 150.75;
        return discount;
    }
}