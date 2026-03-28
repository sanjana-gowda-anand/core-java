class WashingMachine {
    public static void main(String[] args) {
	
	 System.out.println("WashingMachine");
	 System.out.println("---FEATURES---");
	 System.out.println("Cleaning");
	 System.out.println("Easy to use");
	 System.out.println("Water conservation");


        byte warranty = 3;
        short capacity = 7;
        int price = 28000;
        long serialNumber = 334455667788L;

        float weight = 60.5f;
        double powerConsumption = 2.3;

        char machineType = 'F'; // F for Front Load
        boolean inverterMotor = true;

        System.out.println("Washing Machine Details:");
        System.out.println("Warranty: " + warranty);
        System.out.println("Capacity (kg): " + capacity);
        System.out.println("Price: " + price);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight: " + weight);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Machine Type: " + machineType);
        System.out.println("Inverter Motor: " + inverterMotor);
    }
}