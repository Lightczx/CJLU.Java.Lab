package czx.lab6;

public class Cube extends Rect {
    private double height;

    public double getHeight() {
        return height;
    }

    public Cube(){super();}//do nothing
    public Cube(double length, double width,double height) {
        super(length, width);
        this.height=height;
    }
    public void set(double length,double width,double height){
        set(length,width);
        this.height=height;
    }

    public double area(){
        return 2*(length*width+length*height+width*height);
    }

    public double peri(){return 4*(length+width+height);}

    public double vol(){
        return super.area()*height;
    }
}