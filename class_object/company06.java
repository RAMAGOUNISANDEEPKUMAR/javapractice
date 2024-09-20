class company06
{
    String name;
    public static void main(String[] args)
    {
        company06 c1=new company06();
        c1.name="ethnus";
        company06 c2=c1;
        c1=null;
        c2=c1;
        System.out.println(c2.name);
    }
}