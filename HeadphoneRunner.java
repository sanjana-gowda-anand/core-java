class HeadphoneRunner {

    public static void main(String[] args) {

        Headphone.checkHeadphoneIsOnOrOff();

        Headphone.turnOnHeadphone();

        Headphone.checkHeadphoneIsOnOrOff();

        int volume = Headphone.getCurrentVolume();
        System.out.println("Current Volume is: " + volume);
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Headphone.increaseVolume());
		System.out.println("****************"+Headphone.increaseVolume());
		System.out.println("****************"+Headphone.increaseVolume());
				System.out.println("***********DECECREASE**************");
		System.out.println("****************"+Headphone.decreaseVolume());
		System.out.println("****************"+Headphone.decreaseVolume());

    }
}