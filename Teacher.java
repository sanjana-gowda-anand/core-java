class Teacher{
public static void main(String[] args)
{
System.out.println("Hi Students");
getTeachers();
System.out.println(" I will give some information");
int totalTeachers=10;
int totalStudents=70;
boolean isGovernment=true;
getTotalStatement(totalTeachers,totalStudents,isGovernment);
	System.out.println("What is the salary of teacher");
	long salary=getSalary();
	System.out.println("salary ");
}
static void getTeachers( )
{
System.out.println("Hi Mam");
}
static void  getTotalStatement(int totalTeachers,int totalStudents,boolean isGovernment)
{
	System.out.println("Ok mam");
	System.out.println("Total Teachers"+totalTeachers);
	System.out.println("Total Students"+totalStudents);
	System.out.println("isGovernment");
}
	  static long getSalary()
	  {
			long salary=50000;
			return salary; 
			System.out.println("Teacher salary is"+salary );

	  }
}



