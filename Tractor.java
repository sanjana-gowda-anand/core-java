class Tractor {
    static String brand = "Mahindra";//static
    static float fuelCapacity = 60.5f; 
    static char fuelType = 'D';           

    public static void main(String[] args) {
        int gears = 4;//local
        double price = 750000.0;
        String color = "Red";
		
		System.out.println("BRAND="+brand);
		System.out.println("FUEL TANK CAPACITY="+fuelCapacity);
		System.out.println("FUELtYPE="+fuelType);
		System.out.println("GEARS="+gears);
		System.out.println("PRICE="+price);
        System.out.println("COLOR="+color);
			
    }
}