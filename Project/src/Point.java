public class Point {
    String name;
    double x;
    double y;
    double z;


    public Point(){};


    public Point(String name, double x, double y, double z) {
        this.name=name;
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


public  String toString(){
        return name+" "+x+" "+y+" "+z;

}


}
