class Mixer {

    static boolean isMixerOn = false;
    static int currentSpeed = 10;
    static int maxSpeed = 15;
    static int minSpeed = 5;

    static void checkMixerIsOnOrOff()
    {
        if(isMixerOn)
        {
            System.out.println("Mixer is ON");
        }
        else
        {
            System.out.println("Mixer is OFF");
        }
    }

    static void turnOnMixer()
    {
        isMixerOn = true;
        System.out.println("Mixer is turned ON");
    }
	static int getCurrentSpeed() 
	{
        return currentSpeed;
    }

    static int increaseSpeed()
    {
        if(isMixerOn==true)
        {
            System.out.println("Mixer is ON");

            if(currentSpeed<15)
            {
                currentSpeed=currentSpeed+1;
            }
            else
            {
                System.out.println("Mixer is in max speed");
            }

        }
        else
        {
            System.out.println("Mixer is OFF");
        }

        return currentSpeed;
    }

    static int decreaseSpeed()
    {
        if(isMixerOn==true)
        {
            System.out.println("Mixer is ON");

            if(currentSpeed>5)
            {
                currentSpeed=currentSpeed-1;
            }
            else
            {
                System.out.println("Mixer is in min speed");
            }

        }
        else
        {
            System.out.println("Mixer is OFF");
        }

        return currentSpeed;
    }
}