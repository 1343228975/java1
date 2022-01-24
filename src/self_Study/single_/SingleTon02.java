package self_Study.single_;

/**
 * 单例模式
 * 懒汉式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();

        System.out.println(cat);
    }
}

class Cat {
    private String name;
    private static Cat cat;

    private Cat(String name) {
        this.name = name;
    }
    //提供一个public的static方法，可以返回一个cat对象

    public static Cat getCat() {
        if (cat == null) {//如果还没有创建cat对象
            cat = new Cat("小书");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}