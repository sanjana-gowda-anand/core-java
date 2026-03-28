class MixerRunner {

    public static void main(String[] args) {

        Mixer.checkMixerIsOnOrOff();

        Mixer.turnOnMixer();

        Mixer.checkMixerIsOnOrOff();

        int speed = Mixer.getCurrentSpeed();
        System.out.println("Current Speed is: " + speed);
		
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Mixer.increaseSpeed());
		System.out.println("****************"+Mixer.increaseSpeed());
		System.out.println("****************"+Mixer.increaseSpeed());
		System.out.println("****************"+Mixer.increaseSpeed());
		System.out.println("****************"+Mixer.increaseSpeed());
		
				System.out.println("***********DECREASE**************");
		System.out.println("****************"+Mixer.decreaseSpeed());
		System.out.println("****************"+Mixer.decreaseSpeed());
		System.out.println("****************"+Mixer.decreaseSpeed());
		System.out.println("****************"+Mixer.decreaseSpeed());
		System.out.println("****************"+Mixer.decreaseSpeed());
		System.out.println("****************"+Mixer.decreaseSpeed());

    }
}