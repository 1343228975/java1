package self_Study.phase2.innerclass_;

public class AnonymousInnerClass02 {

    public static void main(String[] args) {
        st(new Ip() {
            @Override
            public void hi() {
                System.out.println("哈喽...");
            }
        });
    }
    public static void st(Ip ip){
        ip.hi();
    }
}
interface Ip{
    void hi();
}