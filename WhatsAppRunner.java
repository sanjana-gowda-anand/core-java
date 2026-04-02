class WhatsAppRunner {
    public static void main(String[] args) 
	{

        WhatsApp w3=new WhatsApp("sanju", 9876543210L, true, 120);
        w3.show();
		
		WhatsApp w2=new WhatsApp("sanju", 9876543210L, true);
        w2.show();
		
		WhatsApp w1=new WhatsApp("Sanju");
        w1.show();
    }
}