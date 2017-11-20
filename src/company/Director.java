package company;

public class Director extends ProjectManager {
    public Director(String name, int salary, int percentageHappiness) {
        super(name, salary, percentageHappiness + 10);
    }

  // @Override
    public void shout() {
       System.out.println("WY ***** **** **** ********* ***** ****** ROBOTY");
    }

    public void kickOut() {

    }
}
