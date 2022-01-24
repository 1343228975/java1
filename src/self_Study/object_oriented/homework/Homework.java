package self_Study.object_oriented.homework;

public class Homework {
}
class Point{
    private String lable;

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;

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
}
class  Lable extends Point{
    private String lable;

    public Lable(double x, double y, String lable) {
        super(x, y);
        this.lable = lable;
    }
}