class RefrigeratorRunner {

    public static void main(String[] args) {

        Refrigerator.checkFridgeIsOnOrOff();

        Refrigerator.turnOnFridge();

        Refrigerator.checkFridgeIsOnOrOff();

        int temp = Refrigerator.getCurrentTemperature();
        System.out.println("Current Temperature is: " + temp);
		
		

    System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Refrigerator.increaseTemp());
		System.out.println("****************"+Refrigerator.increaseTemp());
		System.out.println("****************"+Refrigerator.increaseTemp());
		System.out.println("***********DECECREASE**************");
		System.out.println("****************"+Refrigerator.decreaseTemp());
		System.out.println("****************"+Refrigerator.decreaseTemp());
}
}