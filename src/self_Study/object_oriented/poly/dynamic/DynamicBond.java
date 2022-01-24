package self_Study.object_oriented.poly.dynamic;

public class DynamicBond {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;
    public int sum(){
        return getI()+10;
    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return i+10;
    }
}
class B extends A{
    public int i = 20;
    public int sum(){//注销这里，则会调用父类的A方法，父类A方法中调用的getI为B类的getI方法，这就是动态绑定机制，调用对象方法的时候，该方法回合该对象的内存地址及运行类型绑定
        return getI()+10;
    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return i+10;//注销这里，则会调用父类的sum1方法，但是此时的I任然是父类中的，因为属性没有动态绑定机制
    }
}