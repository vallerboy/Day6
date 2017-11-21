package company;

public class Worker extends Employee {

    private int salary;

    public Worker(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String standardWelcome() {
        return "HAY!";
    }
}
