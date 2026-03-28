class LaptopRunner {

    public static void main(String[] args) 
	{

        Laptop.checkLaptopIsOnOrOff();

        Laptop.turnOnLaptop();

        Laptop.checkLaptopIsOnOrOff();

        int battery = Laptop.getBatteryPercentage();
        System.out.println("Battery Percentage is: " + battery);
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Laptop.increaseBattery());
		System.out.println("****************"+Laptop.increaseBattery());
		System.out.println("****************"+Laptop.increaseBattery());
		System.out.println("***********DECECREASE**************");
		System.out.println("****************"+Laptop.decreaseBattery());
		System.out.println("****************"+Laptop.decreaseBattery());

    }
}