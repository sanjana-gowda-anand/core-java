class Heater {

    static boolean isHeaterOn = false;
    static int currentTemperature = 30;
	static int maxHeat=20;
	static int minHeat=10;

    static void checkHeaterIsOnOrOff()
	{
        if(isHeaterOn) {
            System.out.println("Heater is ON");
        } else {
            System.out.println("Heater is OFF");
        }
    }

    static void turnOnHeater()
	{
        isHeaterOn = true;
        System.out.println("Heater is turned ON");
    }

    static int getCurrentTemperature() 
	{
        return currentTemperature;
    }
static int increaseTemp()
	{
		if(isHeaterOn==true)
		{
			System.out.println("Heater is ON");
			if(currentTemperature<20)
			{
				currentTemperature=currentTemperature+1;
			}else{
				System.out.println("Heater is in max current ");
			}
		}else{
			System.out.println(" is Off");
			}
			return currentTemperature;
	}
		static int decreaseTemp()
	{
		if(isHeaterOn==true)
		{
			System.out.println("Heater is ON");
			if(currentTemperature>10)
			{
				currentTemperature=currentTemperature-1;
			}else{
				System.out.println(" Heater is  in min current ");
			}
		}else{
			System.out.println("Heater is Off");
			}
			return currentTemperature ;
}

}