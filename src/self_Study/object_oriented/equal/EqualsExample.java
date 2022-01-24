package self_Study.object_oriented.equal;

import java.util.Objects;

public class EqualsExample {
    public static void main(String[] args) {

        Person java = new Person("jaa", 18, '2');
        Person java1 = new Person("java", 18, '1');
        System.out.println(java.equals(java1));
        System.out.println(java.toString());


    }


}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        } else if (obj instanceof Person) {
            return ((Person) obj).age == this.age && ((Person) obj).gender == this.gender && ((Person) obj).name.equals(this.name);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}