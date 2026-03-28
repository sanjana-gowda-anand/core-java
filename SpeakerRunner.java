class SpeakerRunner {

    public static void main(String[] args) {

        Speaker.checkSpeakerIsOnOrOff();

        Speaker.turnOnSpeaker();

        Speaker.checkSpeakerIsOnOrOff();

        int volume = Speaker.getCurrentVolume();
        System.out.println("Current Volume is: " + volume);
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+Speaker.increaseVolume());
		System.out.println("****************"+Speaker.increaseVolume());
		System.out.println("****************"+Speaker.increaseVolume());
				System.out.println("***********DECECREASE**************");
		System.out.println("****************"+Speaker.decreaseVolume());
		System.out.println("****************"+Speaker.decreaseVolume());

    }
}