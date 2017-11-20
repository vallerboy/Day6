package tasks;

public class MyWater {
    private static int BIG_BOTTLE = 2;
    private static int MID_BOTTLE = 1;
    private static float SMALL_BOTTLE = 0.5f;

    private int bigCount;
    private int midCount;
    private int smallCount;

    public MyWater() {
    }

    public void addBig(int howMany){
        bigCount += howMany;
    }

    public void addMid(int howMany){
        midCount += howMany;
    }

    public void addSmall(int howMany){
        smallCount += howMany;
    }

    public static int getBigBottle() {
        return BIG_BOTTLE;
    }

    public static void setBigBottle(int bigBottle) {
        BIG_BOTTLE = bigBottle;
    }

    public static int getMidBottle() {
        return MID_BOTTLE;
    }

    public static void setMidBottle(int midBottle) {
        MID_BOTTLE = midBottle;
    }

    public static float getSmallBottle() {
        return SMALL_BOTTLE;
    }

    public static void setSmallBottle(float smallBottle) {
        SMALL_BOTTLE = smallBottle;
    }

    public int getBigCount() {
        return bigCount;
    }

    public void setBigCount(int bigCount) {
        this.bigCount = bigCount;
    }

    public int getMidCount() {
        return midCount;
    }

    public void setMidCount(int midCount) {
        this.midCount = midCount;
    }

    public int getSmallCount() {
        return smallCount;
    }

    public void setSmallCount(int smallCount) {
        this.smallCount = smallCount;
    }

    private float calculateWater() {
        return bigCount * BIG_BOTTLE + midCount * MID_BOTTLE +
                smallCount * SMALL_BOTTLE;
    }

    public void printWater(){
        System.out.println("Mam teraz " + calculateWater() + "l. wody");
        System.out.println("Duzych: " + getBigCount());
        System.out.println("Srednich: " + getMidCount());
        System.out.println("Malych: " + getSmallCount());
    }
}
