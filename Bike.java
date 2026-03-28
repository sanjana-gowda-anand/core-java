class Bike {
    public static void main(String[] args) {
	
	 System.out.println("Bike");
	 System.out.println("---FEATURES---");
	 System.out.println("Design");
	 System.out.println("Frame");
	 System.out.println("Safety");


        byte gears = 6;
        short modelYear = 2024;
        int price = 95000;
        long engineNumber = 123123123123L;

        float mileage = 45.5f;
        double fuelTankCapacity = 13.5;

        char fuelType = 'P'; // P for Petrol
        boolean electricStart = true;

        System.out.println("Bike Details:");
        System.out.println("Gears: " + gears);
        System.out.println("Model Year: " + modelYear);
        System.out.println("Price: " + price);
        System.out.println("Engine Number: " + engineNumber);
        System.out.println("Mileage: " + mileage);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Electric Start: " + electricStart);
    }
}