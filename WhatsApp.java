class WhatsApp {

    String userName;
    long phoneNumber;
    boolean isOnline;
    int chatsCount;
    double rating;

    public WhatsApp(String p1, long p2, boolean p3, int p4, double p5) {
        userName = p1;
        phoneNumber = p2;
        isOnline = p3;
        chatsCount = p4;
        rating = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(isOnline);
        System.out.println(chatsCount);
        System.out.println(rating);
    }
}