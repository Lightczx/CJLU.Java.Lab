package czx.lab7;



public class Rect implements ShapeCalc,Cloneable {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void set(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public double peri(){
        return 2*(length+width);
    }

    public Rect() {}
    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
