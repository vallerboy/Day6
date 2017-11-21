package company;

public class ProjectManager extends Worker implements IManagment {

    private int percentageHappiness;

    public ProjectManager(String name, int salary) {
        this(name, salary, 0);
    }

    public ProjectManager(String name, int salary, int percentageHappiness) {
        super(name, salary);
        this.percentageHappiness = percentageHappiness;
    }

    @Override
    public String standardWelcome() {
        return "Jeszcze nie pracujesz?";
    }

    protected void shout(){
        System.out.println("DO ROBOTY!");
    }

    @Override
    public void kickOut() {
        System.out.println("wyrzucam kogos z pracy");
    }

    @Override
    public void cos() {

    }
}
