package self_Study.object_oriented.poly;

import com.alibaba.druid.support.json.JSONUtils;

public class PolyMethond {
    public static void main(String[] args) {
        A a = new A();
        //方法重载体现多态
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1,2,3));
        B b = new B();
        //重写体现多态
        a.say();
        b.say();
    }

}
class B{

    public void say(){
        System.out.println("B say()被调用");
    }


}
class A extends B{
    public int sum(int n1,int n2){
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("A say()被调用");
    }
}
