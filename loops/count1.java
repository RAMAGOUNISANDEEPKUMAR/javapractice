class count1
{
    public static void main(String[] args)
    {
        int num=12;
        int i =1;
        int count=0;
        while(i <= num){
            if (num % i == 0){
                count= count+1;
                  System.out.println(count);

            }
            i++;
            
        }
        System.out.println(count);
    }
}