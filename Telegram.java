class Telegram {

    String userName;
    long phoneNumber;
    boolean isPremium;
    int channelsJoined;
    double rating;

    public Telegram(String p1, long p2, boolean p3, int p4, double p5) {
        userName = p1;
        phoneNumber = p2;
        isPremium = p3;
        channelsJoined = p4;
        rating = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(isPremium);
        System.out.println(channelsJoined);
        System.out.println(rating);
    }
}