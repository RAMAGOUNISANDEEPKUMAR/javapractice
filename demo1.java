import other.test1;

class test2 extends test1{
    public void print(){
        System.out.println(this.value);
    }
}

public class demo1
{
    public static void main(String[] args) {
        test1 obj1 =new test1();
        System.out.println(obj1.value);

       // test2 obj2 =new test2();
        //System.out.println(obj2.value);
    }
}