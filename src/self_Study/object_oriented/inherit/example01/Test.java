package self_Study.object_oriented.inherit.example01;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i10","100G","固态硬盘","神州");

        System.out.println(pc.brand + pc.getData());
        Notepad q = new Notepad("i10","100G","固态硬盘","红色");

        System.out.println(q.color + q.getData());
    }
}
