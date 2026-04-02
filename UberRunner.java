class UberRunner {
    public static void main(String[] args) {

        Uber u1=new Uber("sanju");
        u1.show();

        Uber u2=new Uber("sanju",501, true);
        u2.show();

        Uber u3=new Uber("sanju",501,true,250.5);
        u3.show();
    }
}