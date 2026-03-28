class Fan {
    public static void main(String[] args) {
	
	 System.out.println("Fan");
	 System.out.println("---FEATURES---");
	 System.out.println("Airflow");
	 System.out.println("Efficiency");
	 System.out.println("Technology");


        byte warranty = 3;
        short speedLevels = 5;
        int price = 3500;
        long serialNumber = 223344556677L;

        float weight = 4.5f;
        double powerConsumption = 0.75;

        char fanType = 'C'; // C for Ceiling
        boolean remoteControl = true;

        System.out.println("Fan Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Speed Levels: " + speedLevels);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Fan Type: " + fanType);
        System.out.println("Remote Control: " + remoteControl);
    }
}