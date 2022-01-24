package self_Study.object_oriented.homework;
class Test{
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("赵伦", 22, "学生");
        people[1] = new Person("书", 20, "测评");
        people[2] = new Person("万", 25, "清洁工");
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j+1].getAge()>people[j].getAge()){
                    Person a ;
                    a = people[j];
                    people[j] = people[j+1];
                    people[j+1] = a;

                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println("姓名：" + people[i].getName() +"  年龄："+ people[i].getAge()+" 工作：" +people[i].getJob());
        }
    }
}
public class Person {
    private String name ;
    private int age ;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
