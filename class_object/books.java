public class books
{
    String author ="sandeep";
    String book_name ="Goldendays";
    int price = 539;
    int p_year = 2024;

    void details()
    {
        System.out.println(author);
        System.out.println(book_name);
        System.out.println(price);
        System.out.println(p_year);
    }
    public static void main(String[] args) 
    { 
        books b2 = new books();
        b2.details();
    }
}
