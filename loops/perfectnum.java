class perfectnum
{
    public static void main(String[]args)
    {
        int num =38;
        int i =1;
        int sum = 0;

        while (i<=28){
            if(num%i==0)
            sum =sum+i;
            i++;

        }
         System.out.println("factors of number"+sum);
         if(sum ==num*2){
         System.out.println(num+" its a perfectnumber");
         }
         else
         {
         System.out.println(num+" its a not perfectnumber");
         }
        
    }
}
    