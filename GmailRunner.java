class GmailRunner {
    public static void main(String[] args) {

        Gmail g1 = new Gmail("Sanju", "sanju@gmail.com", 120, 50, true);
		        g1.show();
        Gmail g2 = new Gmail("Ravi", "ravi@gmail.com", 80, 30, true);
		        g2.show();
        Gmail g3 = new Gmail("Anu", "anu@gmail.com", 60, 20, false);
		        g3.show();
        Gmail g4 = new Gmail("Kiran", "kiran@gmail.com", 200, 100, true);
		        g4.show();
        Gmail g5 = new Gmail("Meena", "meena@gmail.com", 150, 70, false);
		        g5.show();
        Gmail g6 = new Gmail("Rahul", "rahul@gmail.com", 170, 90, true);
		        g6.show();
        Gmail g7 = new Gmail("Priya", "priya@gmail.com", 95, 40, true);
		        g7.show();


        
    }
}