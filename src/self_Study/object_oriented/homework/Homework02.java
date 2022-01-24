package self_Study.object_oriented.homework;

public class Homework02 {
    public static void main(String[] args) {
        Professor professor = new Professor("李教授", 50, "教授", 50000);
        AssociateProcessor associateProcessor = new AssociateProcessor("周周周", 20, "副教授", 10000);
        Lecturer lecturer = new Lecturer("马云", 50, "讲师", 1000);
        System.out.println(professor.introduce());
        System.out.println(associateProcessor.introduce());
        System.out.println(lecturer.introduce());

    }
}

class Teach {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teach(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String introduce() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary + " "
                ;
    }
}

class Professor extends Teach {
    private double grade = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() + "grade = " + grade;
    }
}

class AssociateProcessor extends Teach {
    private double grade = 1.2;

    public AssociateProcessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() + "grade = " + grade;
    }
}

class Lecturer extends Teach {
    private double grade = 1.1;

    public Lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String introduce() {
        return super.introduce() + "grade = " + grade;
    }
}