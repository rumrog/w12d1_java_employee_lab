public abstract class Employee {

    private String name;
    int nin;
    double salary;

    public Employee(String name, int nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNin(){
        return this.nin;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary(double raise){
        double newSalary = this.salary + raise;
        return newSalary;
    }

    public double payBonus(double salary){
        double newSalary = this.salary + this.salary * 0.01;
        return newSalary;
    }

}
