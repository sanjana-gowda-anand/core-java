class Speaker {
    public static void main(String[] args) {
	
	 System.out.println("Speaker");
	 System.out.println("---FEATURES---");
	 System.out.println("Connectivity");
	 System.out.println("Smart");
	 System.out.println("Sound");


        byte warranty = 2;
        short batteryLife = 12;
        int price = 5000;
        long serialNo = 667744332211L;

        float weight = 1.2f;
        double frequencyRange = 20.0;

        char connectivity = 'B'; // B for Bluetooth
        boolean waterproof = true;

        System.out.println("Speaker Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Price: " + price);
        System.out.println("Serial No: " + serialNo);
        System.out.println("Weight: " + weight);
        System.out.println("Frequency Range: " + frequencyRange);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Waterproof: " + waterproof);
    }
}