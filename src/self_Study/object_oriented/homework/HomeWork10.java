package self_Study.object_oriented.homework;

import java.util.Objects;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("你好", 123, "教师", 1.14, 30000);
        Doctor doctor1 = new Doctor("你好", 123, "教师", 1.14, 30000);
        Doctor doctor2 = new Doctor("你", 123, "教师", 1.14, 30000);
        System.out.println(doctor.equals(doctor));
        System.out.println( doctor.equals(doctor1));
        System.out.println( doctor.equals(doctor2));

    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private double gender;
    private double sal;

    public Doctor(String name, int age, String job, double gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Doctor){
            return false;
        }
        if ((((Doctor) obj).age == this.age &&
                ((Doctor) obj).gender == this.gender &&
                (((Doctor) obj).job).equals(this.job) &&
                (((Doctor) obj).name).equals(this.name) &&
                ((Doctor) obj).sal == this.sal)) {
            return true;
        }

        return false;
    }

}