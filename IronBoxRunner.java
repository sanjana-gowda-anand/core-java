class IronBoxRunner {

    public static void main(String[] args) {

        IronBox.checkIronIsOnOrOff();

        IronBox.turnOnIron();

        IronBox.checkIronIsOnOrOff();

        int temp = IronBox.getCurrentTemperature();
        System.out.println("Current Temperature is: " + temp);
		
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+IronBox.increaseTemp());
		System.out.println("****************"+IronBox.increaseTemp());
		System.out.println("****************"+IronBox.increaseTemp());
		System.out.println("****************"+IronBox.increaseTemp());
		System.out.println("****************"+IronBox.increaseTemp());
		
				System.out.println("***********DECREASE**************");
		System.out.println("****************"+IronBox.decreaseTemp());
		System.out.println("****************"+IronBox.decreaseTemp());
		System.out.println("****************"+IronBox.decreaseTemp());
		System.out.println("****************"+IronBox.decreaseTemp());
		System.out.println("****************"+IronBox.decreaseTemp());
		System.out.println("****************"+IronBox.decreaseTemp());





    }
}