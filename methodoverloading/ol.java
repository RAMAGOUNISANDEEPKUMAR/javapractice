class ol 
{
    void  company(String name,int budget)
    {
        System.out.println("display of company name= " + name +"," +"budget"+budget);
    }
    void  company(String name,int budget,int year)
    {
        System.out.println("display of company name= " + name +"," +"budget"+budget +","+"year"+year);
    }

    public static void main(String[] args) 
    {
        ol obj = new ol();
        obj.company("ethnus",1000000);
        obj.company("ethnus",1000000,2024);

    }
}