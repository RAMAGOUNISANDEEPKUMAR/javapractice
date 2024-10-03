import java.util.Scanner;
class sumoffactors {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n) {
            if (n % i ==0){
                sum = sum+ i;
            }
            i++;
        }
        System.out.println("sum of factors of " + n +" is "+sum);

    }
}