class String_operatons
{
    public static  void main(String[] args)
    {
        String str1 ="Hello";
        String str2 ="world";
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        
        System.out.println(str3.length());

        System.out.println(str3.toUpperCase());
        
        System.out.println(str3.toLowerCase());

        System.out.println(str3.indexOf("world"));

        System.out.println(str3.substring(6));
        System.out.println(str3.substring(6,11));
        System.out.println(str3.replace("world","universe"));
        System.out.println(str3.startsWith("Hello"));
        System.out.println(str3.endsWith("universe"));
        System.out.println(str3.charAt(6));
        System.out.println(str3.equals("Hello world"));
        System.out.println(str3.equalsIgnoreCase("hello world"));
        System.out.println(str3.compareTo("Hello world"));
        System.out.println(str3.compareToIgnoreCase("hello world"));
        System.out.println(str3.trim());
        System.out.println(str3.split(" "));
        


        

    }
}