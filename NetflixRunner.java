class NetflixRunner {
    public static void main(String[] args) {

        Netflix n1=new Netflix("Sanju");
        n1.show();

        Netflix n2=new Netflix("sanu",301,true);
        n2.show();

        Netflix n3=new Netflix("shashu",302,true,"Premium");
        n3.show();
    }
}