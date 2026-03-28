class MobileRunner {

    public static void main(String[] args) {

        
        Mobile.brand = "Samsung";
        Mobile.country = "India";

        
        Mobile m1 = new Mobile();
        m1.model = "Galaxy A9+";
        m1.price = 20000;
		
		Mobile m2 = new Mobile();
        m2.model = "apple";
        m2.price = 90000;


        
        System.out.println("Brand: " + Mobile.brand);
        System.out.println("Country: " + Mobile.country);
        System.out.println("Model: " + m1.model);
        System.out.println("Price: " + m1.price);
		System.out.println("Model: " + m2.model);
        System.out.println("Price: " + m2.price);
    }
}