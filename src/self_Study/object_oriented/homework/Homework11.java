package self_Study.object_oriented.homework;

public class Homework11 {
    public static void main(String[] args) {
        Person1 p = new Student();
        p.eat();
        p.run();

        ((Student)p).study();
    }


}
class Person1{
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }

}
class Student extends Person1{
    @Override
    public void run() {
        System.out.println("Stundet run");
    }

    @Override
    public void eat() {
        System.out.println("student eat");
    }
    public void study(){
        System.out.println("学生在学习");
    }
}