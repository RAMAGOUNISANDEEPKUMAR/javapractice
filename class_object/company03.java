class company03{
    String name ="ETHNUS";

    public static void main(String[] args) 
    {
        company03 c1 = new company03();
        c1 .name="ETHNUS";
        company03 c2=c1;
        c1=null ;
        System.out.println(c2.name);
    }
}