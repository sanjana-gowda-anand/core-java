class School {
    static String schoolName = " Green Wood School";//static variables
    static int totalStudents = 600;
    static char grade = 'A';

    public static void main(String[] args)
	{
        int teachers = 60;//local variables
        double fees = 25000.75;
		boolean isPrivate=true;
		String schoolName="Government School";
		int totalStudents=500;
		char grade='B';
		
		System.out.println("SCHOOL NAME="+School.schoolName);
		System.out.println("TOTAL STUDENTS ="+School.totalStudents);
		System.out.println("GRADE="+School.grade);
		System.out.println("TEACHERS="+teachers);
		System.out.println("FEES="+fees);
        System.out.println("IS_PRIVATE SCHOOL="+isPrivate);
		System.out.println("SCHOOL NAME="+schoolName);
		System.out.println("TOTAL STUDENTS ="+totalStudents);
        System.out.println("GRADE="+grade);


    }
}