class LinkedIn {

    String userName;
    int userId;
    String jobTitle;
    int connections;
    int experience;  

    public LinkedIn(String p1, int p2, String p3, int p4, int p5) {
        userName = p1;
        userId = p2;
        jobTitle = p3;
        connections = p4;
        experience = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(userId);
        System.out.println(jobTitle);
        System.out.println(connections);
        System.out.println(experience);
    }
}