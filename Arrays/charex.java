class charex
{
    public static void main(String[] args)
    {
        char[] copyForm  = {'d', 'e','c','a','f','f','e','i','n','a','t','e','e','d' };
        char[] copyTo = new char[7];
        System.arraycopy(copyForm,5,copyTo,0,7);
        System.out.println(String.valueOf(copyTo));

    }
}