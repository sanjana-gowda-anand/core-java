class Hospital {
    static String hospitalName = "Government Hospital";//static
    static int totalWards= 2000;
    static float ratings = 3.5f;

    public static void main(String[] args)
	{
        int doctors = 50;//local
        double consultantFee = 600.75;
        String location = "Mandya";
		
		System.out.println("GOVERNMENT HOSPITAL="+hospitalName);
		System.out.println("TOTAL WARDS="+totalWards);
		System.out.println("RATINGS="+ratings);
		System.out.println("DOCTORS="+doctors);
		System.out.println("CONSULTANT FEE="+consultantFee);
        System.out.println("LOCATION ="+location);

    }
}