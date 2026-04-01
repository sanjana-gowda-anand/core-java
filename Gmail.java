class Gmail {

    String userName;
    String email;
    int inboxCount;
    int sentCount;
    boolean isActive;

    public Gmail(String p1, String p2, int p3, int p4, boolean p5) {
        userName = p1;
        email = p2;
        inboxCount = p3;
        sentCount = p4;
        isActive = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(email);
        System.out.println(inboxCount);
        System.out.println(sentCount);
        System.out.println(isActive);
    }
}