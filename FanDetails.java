class FanDetails {

    static byte numberOfBlades;//-------------0
    static short powerWatts;//---------------0
    static int price;//----------------0
    static long serialNumber;//-------------0
    static float speed;//------------------0.0
    static double voltage;//----------------0.0
    static char grade;
	static byte warranty;//------------------0
    static boolean isRemoteControlled;//--------false

    public static void main(String[] args) 
	{

        System.out.println(numberOfBlades);
        System.out.println(powerWatts);
        System.out.println( price);
        System.out.println( serialNumber);
        System.out.println(speed);
        System.out.println(voltage);
        System.out.println(grade);
        System.out.println(isRemoteControlled);
    }
}