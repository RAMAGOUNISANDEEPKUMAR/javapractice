class Overloading
{
    Overloading(String name,int Age) {
        System.out.println("name:" + name);
        System.out.println("Age:" + Age);

    }
    Overloading(String name,int Age,String Gender) {
        System.out.println("name:" + name);
        System.out.println("Age:" + Age);
        System.out.println("Gender:" + Gender);
    }
    public static void main(String[] args)
    {
        Overloading S1 =new Overloading("SANDEEP",25);
        Overloading S2 =new Overloading("SANDEEP",25,"MALE");
    }
}