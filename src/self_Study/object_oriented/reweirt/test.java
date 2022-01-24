package self_Study.object_oriented.reweirt;

public class test {
    public static void main(String[] args) {
        Person person = new Person("zhao",20);
        Student student = new Student("赵伦",21,2104,"91");
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
