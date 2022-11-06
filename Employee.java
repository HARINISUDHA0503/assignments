package IntermediateOops;

public class Employee {
    public void totalSalary(){
        int salary = 40000;
      System.out.println("Employee salary: " + salary);
     }
}
class Manager extends Employee {
       double incentive = 10000;
    public void totalSalary()
    {
        double salary = 40000;
        salary+= incentive;
    System.out.println("Manager salary: " + salary);
    }
}
    class Labour extends Employee {
       double overtime = 5000;
        public void totalSalary()
        {
            double salary = 40000;
            salary+= overtime;
            System.out.println("Labour salary: " + salary);

        }
}

class TestEmployee {
    public static void main(String[] args){
        Employee e = new Employee();
        Manager p = new Manager();
        Labour l = new Labour();
        e.totalSalary();
        p.totalSalary();
        l.totalSalary();
    }
}
