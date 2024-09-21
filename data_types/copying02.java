class copying02
{
    String name;
    int age;
    copying02(String Name,int Age)
    {
        name = Name;
        age = Age;

    }
    public static void main(String [] args)
    {
        copying02 c1 = new copying02("sandeep",25);
        copying02 c2 = new copying02("janu",23);
        System.out.println(c1.name);
        System.out.println(c1.age);
        c2.name = c1.name;
        c2.age = c1.age;
        System.out.println(c2.name);
        System.out.println(c2.age);
    }
}
