class SwiggyRunner {
    public static void main(String[] args) {

        Swiggy s1=new Swiggy("KFC");
        s1.show();

        Swiggy s2=new Swiggy("Dominos",601,true);
        s2.show();

        Swiggy s3=new Swiggy("Pizza Hut",602,false,3);
        s3.show();
    }
}