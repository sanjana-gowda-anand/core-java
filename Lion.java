class Lion {
    static int legs = 4s;//static
    static float averageSpeed = 80.5f;
    static boolean isWild = true;

    public static void main(String[] args) 
	{
        int age = 7;//local
        double weight = 190.5;
        char gender = 'M';
		
		System.out.println("NUMBER OF LEGS ="+legs);
		System.out.println("AVERAGE SPEED ="+averageSpeed);
		System.out.println("IS_WILD="+isWild);
		System.out.println("AGE="+age);
		System.out.println("WEIGHT ="+weight);
        System.out.println("GENDER ="+gender);

    }
}