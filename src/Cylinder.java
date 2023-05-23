import static java.lang.Math.PI;

public class Cylinder {
    private double height;
    private double radius;



    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double cylinderArea(double height, double radius){
        return 2*PI * radius*( height + radius);
    }

    public double cylinderSize(double height, double radius){
        return (PI*radius*radius*height);
    }
}
