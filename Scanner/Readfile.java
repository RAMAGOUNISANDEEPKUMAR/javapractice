import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class Readfile
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        File file = new File("example.txt");
        Scanner sc = new Scanner(file);
        
        while (sc.hasNextLine())
        {
            String line =sc.nextLine();
            System.out.println(line);

        }
        sc.close();

    }
}