package self_Study.object_oriented.poly.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.run();
        animal.sheel();

        Cat cat = (Cat) animal;
        cat.catMouse();
    }
}

class Animal {

    public void run() {
        System.out.println("跑");


    }

    public void sheel() {
        System.out.println("睡觉");
    }

    public void eat() {
        System.out.println("吃");
    }

}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catMouse() {
        System.out.println("猫捉老鼠");
    }

}