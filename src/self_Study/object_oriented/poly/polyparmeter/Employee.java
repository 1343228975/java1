package self_Study.object_oriented.poly.polyparmeter;

class Test {
    public static void main(String[] args) {
        Employee zhao = new Employee("ZHAO", 1000);
        Ordinary shushu = new Ordinary("shushu", 10000);
        Mann zhouzhou = new Mann("zhouzhou", 10000, 2000);
        Test test = new Test();

        test.showEmpAnnal(zhao);
        test.showEmpAnnal(shushu);
        test.showEmpAnnal(zhouzhou);
        test.testWork(shushu);
        test.testWork(zhouzhou);

    }

    public void testWork(Employee e) {
        if (e instanceof Ordinary) {
            ((Ordinary) e).work();
        } else if (e instanceof Mann) {
            ((Mann) e).manner();
        }
    }

    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnual());

    }
}

class Employee {
    private String name;
    private double salare;

    public Employee(String name, double salare) {
        this.name = name;
        this.salare = salare;
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

    public String getAnnual() {
        return "年工资为：  " + salare * 12;

    }
}

class Ordinary extends Employee {
    public Ordinary(String name, double salare) {
        super(name, salare);
    }

    public void work() {
        System.out.println("员工： " + getName() + "正在工作");
    }

    @Override
    public String getAnnual() {
        return "员工" + super.getAnnual();
    }
}

class Mann extends Employee {
    private double bouns;

    public Mann(String name, double salare, double bouns) {
        super(name, salare);
        this.bouns = bouns;
    }

    public void manner() {
        System.out.println("经理：" + super.getName() + "正在工作");
    }

    @Override
    public String getAnnual() {
        return "经理的" + (super.getSalare() * 12 + bouns);
    }
}