class prime1
{
    public static void main(String[] args)
    {
        int num=12;
        int i =1;
        int count=0;
        while( i<=num)
        {
            if (num % i == 0)
            {
                count =count +1;
            }
            i++;
        }
        System.out.println(count);
        if (count==2){
            System.out.println("its a prime number");

        }
        else{
            System.out.println("its not a prime");
        }
    }
}