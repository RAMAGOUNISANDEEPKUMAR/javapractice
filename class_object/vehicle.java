public class vehicle {
    String company = "THAR";
    int price = 450000;
    String color = "black";
    String model = "facelift";

    void cardetails()
    {
        System.out.println(company);
        System.out.println(price);
        System.out.println(color);
        System.out.println(model);

    }
    public static void main(String[] args) {
        vehicle k1 = new vehicle();
        k1.cardetails();
    }
}
