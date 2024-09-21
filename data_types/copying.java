class copying
{
    String name;
    int age;

    copying(String Name,int Age)
    {
        name = Name;
        age = Age;
        System.out.println(name);
        System.out.println(age);
        
    }
    copying(copying c)
    {
        String Name = c.name;
        int Age = c.age;
        System.out.println(Name);
        System.out.println(Age);
    }

    public static void main ( String []  args)
    {
        copying c1 = new copying("sandeep",24);
        copying c2 = new copying(c1);

    }
}
