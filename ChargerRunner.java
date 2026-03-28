class ChargerRunner {

    public static void main(String[] args) {

        Charger.checkChargerIsConnected();

        Charger.connectCharger();

        Charger.checkChargerIsConnected();

        int level = Charger.getChargingLevel();
        System.out.println("Charging Level is: " + level);
		
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Charger.increaseWatt());
		System.out.println("****************"+Charger.increaseWatt());
		System.out.println("****************"+Charger.increaseWatt());
		System.out.println("****************"+Charger.increaseWatt());
		System.out.println("****************"+Charger.increaseWatt());
		
				System.out.println("***********DECREASE**************");
		System.out.println("****************"+Charger.decreaseWatt());
		System.out.println("****************"+Charger.decreaseWatt());
		System.out.println("****************"+Charger.decreaseWatt());
		System.out.println("****************"+Charger.decreaseWatt());
		System.out.println("****************"+Charger.decreaseWatt());
		System.out.println("****************"+Charger.decreaseWatt());


    }
}