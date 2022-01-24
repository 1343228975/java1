package self_Study.for_exeise;

public class Homework13 {
    public static void main(String[] args) {
        Circle n = new Circle();
        PassObject a = new PassObject();
        a.printAreas(n, 5);

    }
}

class  Circle{
    double radius;

    public double fondArea() {
        return Math.PI * radius * radius;
    }

}

class PassObject {

    public void printAreas(Circle c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.radius = i;
            System.out.println(i+"\t"+c.fondArea());

        }
    }
}