package self_Study.object_oriented.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("骨头");
        Cat cat = new Cat("小新");
        Fish fish = new Fish("小鱼");
        tom.feed(dog, bone);

        tom.feed(cat, fish);

    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Bone extends Food {
    public Bone(String name) {
        super(name);
    }

}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Fish extends Food {

    public Fish(String name) {
        super(name);
    }
}

class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* public void feed(Dog ddg,Bone bone){

         System.out.println("主人"+name+"给"+ddg.getName()+"喂食");
     }*/
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "喂食" + food.getName());
    }

}
