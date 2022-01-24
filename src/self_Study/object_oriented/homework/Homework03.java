package self_Study.object_oriented.homework;

public class Homework03 {
    public static void main(String[] args) {
        OrdinaryEmployee zhao = new OrdinaryEmployee("赵伦", 10000, 20);
        Manner zhou = new Manner("周女士", 20000, 10);
        System.out.println(   zhao.printSalare());
        System.out.println(zhou.printSalare());
    }
}
class Employee{
    private String name;
    private double salare;
    private int work_day;

    public Employee(String name, double salare, int work_day) {
        this.name = name;
        this.salare = salare;
        this.work_day = work_day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalare() {
        return salare;
    }

    public void setSalare(double salare) {
        this.salare = salare;
    }

    public int getWork_day() {
        return work_day;
    }

    public void setWork_day(int work_day) {
        this.work_day = work_day;
    }
    public double printSalare(){
       return salare;
    }
}
class Manner extends Employee{
    private double gender = 1.2;

    public Manner(String name, double salare, int work_day) {
        super(name, salare, work_day);

    }

    @Override
    public double printSalare() {
        return 1000+super.printSalare()*super.getWork_day()*gender;
    }
}
class OrdinaryEmployee extends Employee{
    private double gender = 1.0;

    public OrdinaryEmployee(String name, double salare, int work_day) {
        super(name, salare, work_day);
    }

    public double getGender() {
        return gender;
    }

    public void setGender(double gender) {
        this.gender = gender;
    }

    @Override
    public double printSalare() {
        return super.printSalare()*super.getWork_day()*gender;
    }
}