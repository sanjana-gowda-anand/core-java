class Tablet{
    public static void main(String[] args) {
	
	 System.out.println("Tablet");
	 System.out.println("---FEATURES---");
	 System.out.println("Connectivity");
	 System.out.println("Performence");
	 System.out.println("Technology");


        byte warranty = 2;
        short storage = 128;
        int price = 30000;
        long serialNumber = 554433221100L;
        float weight = 500.5f;
        double screenSize = 10.9;

        char colorCode = 'S'; // S for Silver
        boolean supportsStylus = true;

        System.out.println("Tablet Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Supports Stylus: " + supportsStylus);
    }
}