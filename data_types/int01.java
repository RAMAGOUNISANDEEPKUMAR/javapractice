class int01{
    static int x =10;

    public static void main(String[] args)
    {
        int01 obj = new int01();
        int01 obj1 = new int01();
        obj.x= x+1;
        System.out.println(obj.x);
        System.out.println(obj1.x);

    }
}