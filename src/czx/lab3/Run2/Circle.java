package czx.lab3.Run2;

public class Circle {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double peri() {
        return Math.PI * 2 * r;
    }

    public Circle() {
    }

    public Circle(double R) {
        this.r = R;
    }


}
