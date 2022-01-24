package self_Study.object_oriented.homework;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        Person2[] person2s = new Person2[4];
        person2s[0] = new Student1("小周",'男',22,"20111312416");
        person2s[1] = new Student1("小书",'女',20,"20111312123");
        person2s[2] = new Teacher("小赵",'男',23,30);
        person2s[3] = new Teacher("小鱼",'女',26,31);
        Homework13 homework13 = new Homework13();
        homework13.PrintArr(person2s);


    }
    public void PrintArr(Person2[] person2s){
        for (int i = 0; i < person2s.length-1; i++) {
            for (int j = 0; j < person2s.length-1-i; j++) {

                if (person2s[j+1].getAge()>person2s[j].getAge()){
                    Person2 a=null;
                    a = person2s[j+1];
                    person2s[j+1]=person2s[j];
                    person2s[j] = a;

                }
            }
        }
        for (int i = 0; i < person2s.length; i++) {
            if (person2s[i] instanceof Student1){
                Student1 student1 = (Student1)person2s[i];
                System.out.println("--------------学生信息-------------");
                System.out.println("学生的信息:");
                System.out.println("姓名："+person2s[i].getName());
                System.out.println("年龄："+person2s[i].getAge());
                System.out.println("性别："+person2s[i].getSex());
                System.out.println("学号："+student1.getStu_id());
                student1.study();
                System.out.println(student1.play());
                System.out.println("---------------------------------");
            }else if (person2s[i] instanceof Teacher){
                Teacher teacher = (Teacher)person2s[i];
                System.out.println("--------------教师信息-------------");
                System.out.println("教师的信息:");
                System.out.println("姓名："+person2s[i].getName());
                System.out.println("年龄："+person2s[i].getAge());
                System.out.println("性别："+person2s[i].getSex());
                System.out.println("工龄："+teacher.getWork_age());
                teacher.tech();
                System.out.println(teacher.play());
                System.out.println("---------------------------------");

            }
        }
    }


}

class Person2 {
    private String name;
    private char sex;
    private int age;

    public Person2() {
    }

    public Person2(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){
        return name+"在玩";
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +" ";
    }
}

class Student1 extends Person2 {

    private String stu_id;

    public Student1(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }

    @Override
    public String toString() {
        return super.toString() +
                "stu_id='" + stu_id + '\'' ;
    }
}

class Teacher extends Person2 {
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void tech(){
        System.out.println("老师在教书");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }

    @Override
    public String toString() {
        return super.toString() +
                "work_age=" + work_age ;
    }
}
