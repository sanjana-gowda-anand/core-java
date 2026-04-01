class WhatsAppRunner {
    public static void main(String[] args) {

        WhatsApp w1 = new WhatsApp("Sanju", 9876543210L, true, 120, 4.5);
		        w1.show();
        WhatsApp w2 = new WhatsApp("Ravi", 9123456780L, false, 80, 4.2);
		        w2.show();
        WhatsApp w3 = new WhatsApp("Anu", 9988776655L, true, 60, 3.9);
		        w3.show();
        WhatsApp w4 = new WhatsApp("Kiran", 9012345678L, true, 200, 4.8);
		        w4.show();
        WhatsApp w5 = new WhatsApp("Meena", 9090909090L, false, 150, 4.0);
		        w5.show();
        WhatsApp w6 = new WhatsApp("Rahul", 9871234567L, true, 170, 4.6);
		        w6.show();
        WhatsApp w7 = new WhatsApp("Priya", 9765432109L, false, 95, 4.3);
		        w7.show();
}
}