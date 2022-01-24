package self_Study.object_oriented.inherit.example01;

public class Notepad extends Computer {
    public String color;

    public Notepad(String cPU, String neicun, String yingpan, String color) {
        super(cPU, neicun, yingpan);
        this.color = color;
    }

    public Notepad() {

    }

}
