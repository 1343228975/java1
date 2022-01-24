package self_Study.object_oriented.inherit.example01;

public class PC extends Computer {
    public String brand;

    public PC(String cPU, String neicun, String yingpan, String brand) {
        super(cPU, neicun, yingpan);
        this.brand = brand;
    }

    public PC() {

    }
}
