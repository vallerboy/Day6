public final class Circle {

    private int r;
    private static  float PI = 3.14F;


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



    public  class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
