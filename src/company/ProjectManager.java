package company;

public class ProjectManager extends Worker {

    private int percentageHappiness;

    public ProjectManager(String name, int salary) {
        this(name, salary, 0);
    }

    public ProjectManager(String name, int salary, int percentageHappiness) {
        super(name, salary);
        this.percentageHappiness = percentageHappiness;
    }

    protected void shout(){
        System.out.println("DO ROBOTY!");
    }
}
