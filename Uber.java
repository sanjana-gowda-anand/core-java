class Uber {

    String driverName;
    int rideId;
    boolean isBooked;
    double fare;

    public Uber() {
	  System.out.println("Details");

    }

    public Uber(String driverName,int rideId,boolean isBooked,double fare) {
        this.driverName=driverName;
		this.rideId=rideId;
		this.isBooked=isBooked;
        this.fare=fare;
    }

    public void show() {
        System.out.println(driverName);
        System.out.println(rideId);
        System.out.println(isBooked);
        System.out.println(fare);
    }
}