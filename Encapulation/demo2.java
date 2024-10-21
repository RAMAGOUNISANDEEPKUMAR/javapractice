class Stu1 {
    private String name;
    private int age;
    private int marks;

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getmarks(){
        return marks;
    }
    public void setmarks(int marks){
        this.marks=marks;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Stu1 s1 = new Stu1();
        s1.setname("ANIL");
        s1.setage(22);
        s1.setmarks(89);

        System.out.println("Name: " + s1.getname());
        System.out.println("Age: " + s1.getage());
        System.out.println("Marks: " + s1.getmarks());
    }
}