class Master {
    public static void main(String[] args) {
        System.out.println("Hi Teacher");
        getTeacher(); 

        int math = 90;
        int science = 85;
        String result = "Pass";
        calculateTotal(math, science, result); 

        System.out.println("What is the salary for Teacher");
        long salary = getSalary(); 
        System.out.println(salary);
    }

    static void getTeacher() {
        System.out.println("This is Teacher");
    }

    static void calculateTotal(int math, int science, String result) {
        System.out.println("Calculating total marks");
        int total = math + science;
        System.out.println(total);
        System.out.println(result);
    }

    static long getSalary() {
        System.out.println(" Teacher salary");
        long salary = 50000;
        return salary;
    }
}