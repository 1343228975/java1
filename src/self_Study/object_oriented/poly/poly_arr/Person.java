package self_Study.object_oriented.poly.poly_arr;


class PolyArr{
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("jack",20);
        person[1] = new Student("tom",22,"22");
        person[2] = new Student("shushu",20,"100");
        person[3] = new Teacher("lunlun",22,"10000");
        person[4] = new Teacher("smith",52,"22000");
        for (int i = 0; i <person.length ; i++) {
            System.out.println(person[i].say());
            if (person[i] instanceof Student){
                System.out.println(((Student)person[i]).study());
            }else if (person[i] instanceof Teacher){
                System.out.println(((Teacher)person[i]).teach());
            }else if (person[i] instanceof Person){

            }else {
                System.out.println("类型不匹配..");
            }
        }

    }
}


 class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


    public String say() {
        return
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }
}


class Student extends Person{
    private String score;

    public Student(String name, int age, String score) {
        super(name, age);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String say() {
        return super.say() + "   score= "+score;
    }
    public String study(){
        return "学生： "+super.say()+"正在听java课";
    }
}
class Teacher extends Person{
    private String salary;

    public Teacher(String name, int age, String salary) {
        super(name, age);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


    public String say() {
        return super.say() + "   salary  " + salary;
    }
    public String teach(){
        return "老师： "+super.say()+"正在教java课";
    }
}