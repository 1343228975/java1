package self_Study.object_oriented.poly.detail;

public class PolyDetail01 {
    public static void main(String[] args) {
        //属性没有重写之说
        Base base = new Sub();
        System.out.println(base.count);
    }
}
class Base{
    int count = 10;

}
class  Sub extends Base{
    int count = 20;
}
