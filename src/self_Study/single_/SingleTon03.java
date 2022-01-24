package self_Study.single_;

public class SingleTon03 {


    public static void main(String[] args) {
        Cat1 cat = Cat1.getCat();
        System.out.println(cat);
    }
}
class Cat1{
    private String name;
    private static Cat1 cat = new Cat1("消化");

    public Cat1(String name) {
        this.name = name;
    }

    public static Cat1 getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "Cat1{" +
                "name='" + name + '\'' +
                '}';
    }
}