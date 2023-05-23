public class Parallelepiped {
    private double height;
    private double length;
    private double width;


    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double parallelepipedArea(double height, double length, double width){
        return  2 * ((height * length) + (length * width) + (height * width));
    }

    public double parallelepipedSize(double height, double length, double width){
        return length*width*height;
    }

}
