package self_Study.object_oriented.poly.objpoly;

public class ObjetPoly {
    public static void main(String[] args) {
        //编译类型是Animal ,运行类型是Dog
         Animal animal = new Dog();
         animal.cry();//因为运行到该行时，animal运行类型是Dog

    }
}
class Animal{
    public void cry(){
        System.out.println(" ANimal  动物在叫");
    }
}
class Cat extends Animal{

    public void cry(){
        System.out.println("cat 小猫喵喵叫...");
    }
}
class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫..");
    }
}