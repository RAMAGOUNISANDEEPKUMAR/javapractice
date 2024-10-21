class overloading 
{
    void add(int a,int b)
    {
        System.out.println("sum of two integers: " + (a+b));
    }
     void add(int a,int b,int c)
    {
        System.out.println("sum of three integers: " + (a+b+c));
    }
     void add(double a,double b)
    {
        System.out.println("sum of two doubles: " + (a+b));
    }
    public static void main(String[] args) {
        
        overloading obj = new overloading();

        obj.add(10, 20);
        obj.add(10, 20,30);
        obj.add(10.5, 20.5);

    }
}
