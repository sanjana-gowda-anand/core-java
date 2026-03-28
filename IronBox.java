class IronBox {

    static boolean isIronOn = false;
    static int currentTemperature = 50;
	static int maxTemp=56;
	static int minTemp=-56;

    static void checkIronIsOnOrOff()
	{
        if(isIronOn) 
		{
            System.out.println("Iron Box is ON");
        } else {
            System.out.println("Iron Box is OFF");
        }
    }
    static void turnOnIron() 
	{
        isIronOn = true;
        System.out.println("Iron Box is turned ON");
    }
    static int getCurrentTemperature()
	{
        return currentTemperature;
    }
		static int increaseTemp()
	{
		if(isIronOn==true)
		{
			System.out.println("Iron Box is ON");
			if(currentTemperature<56)
			{
				currentTemperature=currentTemperature+1;
			}else{
				System.out.println("Iron box is in max temp ");
			}
		}else{
			System.out.println("Iron Box is OFF");
			}
			return currentTemperature;
	}
		static int decreaseTemp()
	{
		if(isIronOn==true)
		{
			System.out.println("Iron Box is ON");
			if(currentTemperature>-56)
			{
				currentTemperature=currentTemperature-1;
			}else{
				System.out.println("Iron box is in min temp ");
			}
		}else{
			System.out.println("Iron Box is OFF");
			}
			return currentTemperature ;
}

}