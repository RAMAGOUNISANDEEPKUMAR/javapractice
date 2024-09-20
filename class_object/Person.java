class Person {
    String name;
    String place;

    Person(String n, String p){
        name = n;
        place = p;

    }
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("place: " + place);
    }
    public static void main(String[] args) {
        Person Person1 = new Person("raju","Delhi");
        Person1.Display();

        Person p2 = new Person("sandeep","tadipatri");
        p2.Display();
    }

}