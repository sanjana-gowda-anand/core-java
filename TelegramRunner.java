class TelegramRunner {
    public static void main(String[] args) {

        Telegram t1 = new Telegram("Sanju", 9876543210L, true, 50, 4.5);
		        t1.show();
        Telegram t2 = new Telegram("Ravi", 9123456780L, false, 30, 4.2);
		        t2.show();
        Telegram t3 = new Telegram("Anu", 9988776655L, true, 20, 3.9);
		        t3.show();
        Telegram t4 = new Telegram("Kiran", 9012345678L, true, 80, 4.8);
		        t4.show();
        Telegram t5 = new Telegram("Meena", 9090909090L, false, 40, 4.0);
		        t5.show();
        Telegram t6 = new Telegram("Rahul", 9871234567L, true, 60, 4.6);
		        t6.show();
        Telegram t7 = new Telegram("Priya", 9765432109L, false, 35, 4.3);
		        t7.show();


        
    }
}