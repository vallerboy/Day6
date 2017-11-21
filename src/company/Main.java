package company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Oskar", 1600);
        System.out.println(worker.getSalary());

        ProjectManager projectManager = new ProjectManager("Oskar", 5000);
        projectManager.shout();

        ProjectManager director = new Director("Oskar", 10000, 80);
        director.shout();
        //director.kickOut();

        Worker[] workers = new Worker[3];
        workers[0] = worker;
        workers[1] = projectManager;
        workers[2] = director;


        IManagment someBoss = director;

        IManagment[] projectManagers = new IManagment[5];
        projectManagers[0] = projectManager;
        projectManagers[1] = director;



    }
}
