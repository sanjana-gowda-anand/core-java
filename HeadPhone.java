class HeadPhone {
    public static void main(String[] args) {
	
	 System.out.println("Headphone");
	 System.out.println("---FEATURES---");
	 System.out.println("Comfort");
	 System.out.println("Connectivity");
	 System.out.println("Sound quality");

       byte warranty = 1;
        short batteryLife = 30;
        int price = 2500;
        long serialNo = 776655443322L;

        float weight = 250.5f;
        double frequencyRange = 20.5;

        char type = 'W'; // W for Wireless
        boolean noiseCancellation = true;

        System.out.println("Headphone Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Price: " + price);
        System.out.println("Serial No: " + serialNo);
        System.out.println("Weight: " + weight);
        System.out.println("Frequency Range: " + frequencyRange);
        System.out.println("Type: " + type);
        System.out.println("Noise Cancellation: " + noiseCancellation);
    }
}