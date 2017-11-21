package company;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract String standardWelcome();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
