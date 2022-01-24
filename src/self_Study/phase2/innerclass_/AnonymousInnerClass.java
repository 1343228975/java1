package self_Study.phase2.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void cry() {
                System.out.println("小猴..");
            }
        };
        a.cry();
    }
}
interface A{
    public void cry();
}