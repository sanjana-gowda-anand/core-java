class ShoppingMall {

  public static void main(String []args){

    System.out.println("Are you open today");
    getShoppingMall();
  
    System.out.println("How many customers visited today");
    int morningCustomers = 500;
    int eveningCustomers = 650;
    boolean hasFoodCourt = true;
    tosay(morningCustomers, eveningCustomers, hasFoodCourt);

    double parkingFee = getYourParkingFee();
    System.out.println(parkingFee);
    System.out.println("Hi ShoppingMall what is your parking fee");
  }

  static void getShoppingMall(){
    System.out.println("Yes I am open today");
  }

  static void tosay(int morningCustomers, int eveningCustomers, boolean hasFoodCourt){
    System.out.println("Ok I will tell you");
    int totalCustomers = morningCustomers + eveningCustomers;
    System.out.println(totalCustomers);
    System.out.println(hasFoodCourt);
  }

  static double getYourParkingFee(){
    System.out.println("Wait a minute");
    double parkingFee = 50.0;
    System.out.println("Now I know my parking fee");
    return parkingFee;
  }
}