class Truecaller {

    String userName;
    long phoneNumber;
    String location;
    boolean isSpam;
    int callCount;

    public Truecaller(String p1, long p2, String p3, boolean p4, int p5) {
        userName = p1;
        phoneNumber = p2;
        location = p3;
        isSpam = p4;
        callCount = p5;
    }

    public void show() {
        System.out.println(userName);
        System.out.println(phoneNumber);
        System.out.println(location);
        System.out.println(isSpam);
        System.out.println(callCount);
    }
}