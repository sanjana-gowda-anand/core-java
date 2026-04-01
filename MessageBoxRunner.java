class MessageBoxRunner {
    public static void main(String[] args) {

        MessageBox m1 = new MessageBox("Sanju", "Ravi", "Hello", 5, true);
		        m1.show();
        MessageBox m2 = new MessageBox("Ravi", "Sanju", "Hi", 2, true);
		        m2.show();
        MessageBox m3 = new MessageBox("Anu", "Kiran", "Good Morning", 12, false);
		        m3.show();
        MessageBox m4 = new MessageBox("Kiran", "Anu", "How are you?", 12, true);
		        m4.show();
        MessageBox m5 = new MessageBox("Meena", "Rahul", "Meeting at 5", 12, false);
		        m5.show();
        MessageBox m6 = new MessageBox("Rahul", "Meena", "Okay", 4, true);
		        m6.show();
        MessageBox m7 = new MessageBox("Priya", "Sanju", "See you soon", 12, false);
		        m7.show();


        
    }
}