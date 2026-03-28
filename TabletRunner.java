class TabletRunner {

public static void main(String[] args) {

AmazonTablet tablet = new AmazonTablet();

System.out.println(tablet.getProductName());
System.out.println(tablet.getPrice());
System.out.println(tablet.getRating());
System.out.println(tablet.getTouchScreen());
System.out.println(tablet.getModel());
System.out.println(tablet.getProductId());
System.out.println(tablet.getWeight());

}
}