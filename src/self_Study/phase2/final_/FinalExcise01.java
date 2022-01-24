package self_Study.phase2.final_;

public class FinalExcise01 {
    public static void main(String[] args) {
        Cirle cirle = new Cirle(2);
        System.out.println(cirle.computeArea());
    }
}
class Cirle{
    private double r ;
    private final static double pi = 3.14;
    private final static double pi1 ;
//    private final static double pi2 ;

    public Cirle(double r) {
        this.r = r;
    }

    public Cirle() {
//        pi2 = 3.14;
    }
    static {
        pi1 = 3.14;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public static double getPi() {
        return pi;
    }

    public static double getPi1() {
        return pi1;
    }
    public double computeArea(){
        return pi*(Math.pow(r,2));
    }

//    public static double getPi2() {
//        return pi2;
//    }
}