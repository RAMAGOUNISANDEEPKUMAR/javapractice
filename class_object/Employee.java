class Employee {
    String name;
    String EmpId;
    static String company = "ABC company";

    public static void main(String[]args) {
        System.out.println("Hi I am main()");
        System.out.println("Everyone works for : "+ company);
        //object creation
        Employee emp1 = new Employee();
        emp1.name = "Raja";
        emp1.EmpId ="Emp101";
        System.out.println("Employee Name:"+emp1.name);
        System.out.println("Employee ID: "+ emp1.EmpId);

        
    }
}