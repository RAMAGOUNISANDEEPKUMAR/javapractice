class Increment03
{
    public static void main(String[] args) 
    {
        int x =5;
        int y = ~x;
        int z;
        z= x > y ? x : y;
        System.out.println(y);
    }
}