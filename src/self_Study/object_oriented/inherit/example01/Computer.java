package self_Study.object_oriented.inherit.example01;

public class Computer {
    private String cPU;
    private String neicun;
    private String yingpan;

    public Computer() {

    }

    public Computer(String cPU, String neicun, String yingpan) {
        this.cPU = cPU;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getData() {
        return cPU + neicun + yingpan;
    }
}
