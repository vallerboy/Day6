public class Circle {

    private int r;
    private final float PI = 3.14F;
    

    public Circle(int r) {
        this.r = r;
    }

    public float calculateArea() {
        return (float) (PI * Math.pow(r, 2));
    }


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
