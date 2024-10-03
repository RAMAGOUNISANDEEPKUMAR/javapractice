import java.util.Scanner;
class Scanner_demo
{
    public static void main(String[] args)
    {
        System.out.println("hi hello");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your course: ");
        String course = sc.next();

        System.out.print("Enter your coursefee: ");
        int coursefee = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        float CGPA = sc.nextFloat();

        System.out.println("your name is : "+ name);
        System.out.println("your learning: "+course);
        System.out.println("your coursefee: "+coursefee);
        System.out.println("your CGPA: "+CGPA);


        sc.close(); 



    }
}