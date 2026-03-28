class Bedroom {
    static int totalWindows = 2;//static
    static float roomSize = 200.5f;
    static char wallColorCode = 'B';

    public static void main(String[] args)
	{
        int pillows = 4;//local
        double electricityUsage = 5.5;
		boolean isOwn=true;
		
        System.out.println("TOTAL WINDOWS IN BEDROOM ="+totalWindows);
		System.out.println("ROOM SIZE="+roomSize);
		System.out.println("WALL COLOR="+wallColorCode);
		System.out.println("PILLOWS="+pillows);
		System.out.println("ELECTRICITY USAGE  ="+electricityUsage);
        System.out.println(" IS_OWN="+isOwn);
		
		
		
    }
}