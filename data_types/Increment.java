class Increment
{
    public static void main(String[] args)
    {
        int x = 10 ,y =20 ,z=30;
        x=(++x + y--) * z++;
        System.out.println(x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}