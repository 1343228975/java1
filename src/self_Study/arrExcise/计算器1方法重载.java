package self_Study.arrExcise;
import java.util.*;
public class 计算器1方法重载 {
    public static void main(String[] args) {
        Aa name = new Aa();
        System.out.println(name.jisuan(1, 1,1));
    }
}

class Aa {
    public double jisuan(int n, double y) {

        return n + y;
    }

    public double jisuan(int n, int y) {

        return n + y;
    }

    public double jisuan(double n, double y) {

        return n + y;
    }

    public double jisuan(double n, int y) {

        return n + y;
    }
    public double jisuan(double n, int y,int x) {

        return n + y+x;
    }
}
