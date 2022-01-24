package self_Study.phase2.absctract_;

 class Test{
    public static void main(String[] args) {
        Manner manner = new Manner("周经理", 101, 1000, 200);
        CommonEloyee commonEloyee = new CommonEloyee("赵员工", 102, 100);
        manner.work();
        commonEloyee.work();
    }
}

abstract class Emploee {
    private String name;
    private int id;
    private double salary;

    public Emploee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
class  Manner extends Emploee{
    private double bunus;

    public Manner(String name, int id, double salary, double bunus) {
        super(name, id, salary);
        this.bunus = bunus;
    }

    public double getBunus() {
        return bunus;
    }

    public void setBunus(double bunus) {
        this.bunus = bunus;
    }

    @Override
    public void work() {
        System.out.println("经理"+super.getName()+"正在工作中。。。");
    }
}
class CommonEloyee extends Emploee{
    public CommonEloyee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作中...");
    }
}