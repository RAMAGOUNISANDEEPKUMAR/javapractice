class Mathoperation
{   int s1,s2,s3,s4;
    void add(int x,int y)
    {
        s1=x+y;
        System.out.println(s1);
    }
    void substract(int x,int y)
    {
        s2=x-y;
        System.out.println(s2);
    }
    void division(int x,int y)
    {
        s3=x/y;
        System.out.println(s3);
    }
    public static void main(String[]args)
    {
        Mathoperation m1 = new Mathoperation();
        m1.add(50,10);
        m1.substract(50,10);
        m1.division(50,10);
    }
    
}