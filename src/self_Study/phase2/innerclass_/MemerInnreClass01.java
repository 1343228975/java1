package self_Study.phase2.innerclass_;
/**
 * 成员内部类
 * */
public class MemerInnreClass01 {
    public static void main(String[] args) {
        Outerclass outerclass = new Outerclass();
        //外部其他类访问成员内部类的方法
        /*1.用外部类的对象.new一个内部类
          2.在外部类中创建一个返回内部类对象的方法
        * */
        //1
        Outerclass.InnerClass innerClass = outerclass.new InnerClass();
        innerClass.say();

        //2
        outerclass.getInnerClass().say();


    }
}
class Outerclass{
    private int n1 = 100;


    class InnerClass{
        private int n1 = 200;
        public void say(){

            System.out.println("n1 = "+ n1);
            System.out.println("外部类n1 = "+ Outerclass.this.n1);
        }
    }
    public void nihao(){
        InnerClass innerClass = new InnerClass();
        innerClass.say();
    }
    public InnerClass getInnerClass(){
        return new InnerClass();
    }

}