class StudentAdmission 
{
    String studentName;
    int applicationId;
    String course;
    String collegeName;
    long mobileNumber;

    public StudentAdmission(String studentName,int applicationId,String course,String collegeName,long mobileNumber)
	{
        this.studentName=studentName;
        this.applicationId=applicationId;
        this.course=course;
        this.collegeName=collegeName;
        this.mobileNumber=mobileNumber;
    }

    public void show()
	{
        System.out.println(studentName);
        System.out.println(applicationId);
        System.out.println(course);
        System.out.println(collegeName);
        System.out.println(mobileNumber);
    }
}