class MessageBox {

    String senderName;
    String receiverName;
    String message;
    int messageLength;
    boolean isRead;

    public MessageBox(String p1, String p2, String p3, int p4, boolean p5) {
        senderName = p1;
        receiverName = p2;
        message = p3;
        messageLength = p4;
        isRead = p5;
    }

    public void show() {
        System.out.println(senderName);
        System.out.println(receiverName);
        System.out.println(message);
        System.out.println(messageLength);
        System.out.println(isRead);
    }
}