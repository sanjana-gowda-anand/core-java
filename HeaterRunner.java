class HeaterRunner {

    public static void main(String[] args) 
	{

        Heater.checkHeaterIsOnOrOff();

        Heater.turnOnHeater();

        Heater.checkHeaterIsOnOrOff();

        int temp = Heater.getCurrentTemperature();
        System.out.println("Current Temperature is: " + temp);
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Heater.increaseTemp());
		System.out.println("****************"+Heater.increaseTemp());
		System.out.println("****************"+Heater.increaseTemp());
				System.out.println("***********DECECREASE**************");
		System.out.println("****************"+Heater.decreaseTemp());
		System.out.println("****************"+Heater.decreaseTemp());

    }
}