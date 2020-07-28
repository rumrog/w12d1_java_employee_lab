package staff;

public abstract class Employee {

    protected String name;
    protected String nin;
    protected double salary;

    public Employee(String name, String nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNin(){
        return this.nin;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raise){
        if(raise > 0){
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
