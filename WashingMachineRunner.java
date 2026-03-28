class WashingMachineRunner {

    public static void main(String[] args) {

        WashingMachine.checkMachineIsOnOrOff();

        WashingMachine.turnOnMachine();

        WashingMachine.checkMachineIsOnOrOff();

        int water = WashingMachine.getCurrentWaterLevel();
        System.out.println(" Current Water Level is: " + water);
		
		System.out.println("***********INCECREASE**************");

		System.out.println("****************"+WashingMachine.increaseWater());
		System.out.println("****************"+WashingMachine.increaseWater());
		System.out.println("****************"+WashingMachine.increaseWater());
		System.out.println("****************"+WashingMachine.increaseWater());
		System.out.println("****************"+WashingMachine.increaseWater());
		
				System.out.println("***********DECREASE**************");
		System.out.println("****************"+WashingMachine.decreaseWater());
		System.out.println("****************"+WashingMachine.decreaseWater());
		System.out.println("****************"+WashingMachine.decreaseWater());
		System.out.println("****************"+WashingMachine.decreaseWater());
		System.out.println("****************"+WashingMachine.decreaseWater());
		System.out.println("****************"+WashingMachine.decreaseWater());




    }
}