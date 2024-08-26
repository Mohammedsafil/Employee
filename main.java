package Employee;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Employee e = new Manager("Guru", 102, 100000);
            e.details();
            e = new Engineer("Gilli", 110, 1000020);
            e.details();
    }
}


abstract class Employee{
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    abstract void details();


}

class Manager extends Employee{
    public Manager(String name, int id, double baseSalary){
        super(name,id,baseSalary);
    }

    public void details(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+ baseSalary);
    }
}

class Engineer extends Employee{
    public Engineer(String name, int id, double baseSalary){
        super(name, id, baseSalary);
    }

    public void details(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+ baseSalary);
    }
}

