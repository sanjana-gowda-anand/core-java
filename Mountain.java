class Mountain {

  public static void main(String []args){

    System.out.println("Are you high");
    getMountain();
    System.out.println("How many visitors came");
    int weekdayVisitors = 120;
    int weekendVisitors = 250;
    boolean isSnowy = true;
    int totalVisitors = calculateVisitors(weekdayVisitors, weekendVisitors, isSnowy);
    System.out.println("Total Visitors : " + totalVisitors);

    double heightOfMountain = getHeight();
    System.out.println(heightOfMountain);
    System.out.println(" Hi Mountain what is your height");
  }
  static void getMountain(){
    System.out.println("Yes I am very high");
  }
  static int calculateVisitors(int weekdayVisitors, int weekendVisitors, boolean isSnowy){
    System.out.println("Ok I will calculate visitors impact");
    int result = weekdayVisitors * 2;   
    System.out.println(isSnowy);
    return result;
  }
  static double getHeight(){
    System.out.println("Wait for a moment");
    double height = 8848.86;
    System.out.println("Now I know my height");
    return height;
  }
  
}