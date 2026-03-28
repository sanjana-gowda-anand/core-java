class TVRunner {

    public static void main(String[] args) {

        TV.checkTvIsOnOrOff();

        TV.turnOnTV();

        TV.checkTvIsOnOrOff();

        int volume = TV.getCurrentVolume();
        System.out.println("Current Volume is: " + volume);

		System.out.println("INCREASE VOLUME");
		System.out.println("***********"+TV.incTvVolume());
		System.out.println("***********"+TV.incTvVolume());
		System.out.println("***********"+TV.incTvVolume());
		System.out.println("***********"+TV.incTvVolume());
		System.out.println("***********"+TV.incTvVolume());	

		System.out.println("DECREASE VOLUME");
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());
		System.out.println("***********"+TV.decTvVolume());


		
		
		

    }
}