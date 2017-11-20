package company;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Oskar", 1600);
        System.out.println(worker.getSalary());

        ProjectManager projectManager = new ProjectManager("Oskar", 5000);
        projectManager.shout();

        ProjectManager director = new Director("Oskar", 10000, 80);
        director.shout();
        //director.kickOut();


    }
}
