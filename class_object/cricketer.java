class cricketer{
    String name = "Virat";
    int age = 35;
    String color = "Brown";
    String role = "Batsman";
    String nationality ="Indian";

    void cricketerdetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
        System.out.println(role);
        System.out.println(nationality);
    }
    public static void main(String[] args)
    {
        cricketer c = new cricketer();
        c.cricketerdetails();
    
    }

}