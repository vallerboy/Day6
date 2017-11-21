package tasks.task10;

public class Main {
    public static void main(String[] args) {
        Punkt2D punkt2D = new Punkt2D(1,2);
        Punkt2D punkt2D1 = new Punkt2D(5,25);
        Punkt2D punkt2D2 = new Punkt2D();


        Punkt3D punkt3D = new Punkt3D(1,2,3);
        Punkt3D punkt3D1 = new Punkt3D(punkt2D, 5);

        Object[] myData = new Object[5];
        myData[0] = punkt2D;
        myData[1] = "asd";
        myData[2] = punkt3D;
        myData[3] = 12342;
        myData[4] = 13F;

        for (Object myObject : myData) {
           if(myObject instanceof Integer){

           }
        }
    }
}
