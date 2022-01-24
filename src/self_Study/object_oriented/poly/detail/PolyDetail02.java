package self_Study.object_oriented.poly.detail;

public class PolyDetail02 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
    }

}
class AA{

}
class BB extends AA{

}