package self_Study.object_oriented.homework;

public class Homework04 {
    public static void main(String[] args) {
        SavingAcoounrt savingAcoounrt = new SavingAcoounrt(1000);
        savingAcoounrt.despoit(100);
        savingAcoounrt.despoit(100);
        savingAcoounrt.despoit(100);
        savingAcoounrt.despoit(100);
        System.out.println(savingAcoounrt.getBalance());
        savingAcoounrt.earnMonthlyInterset();
        System.out.println(savingAcoounrt.getBalance());

    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void despoit(double amout) {
        balance += amout;
    }

    public void withdrow(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void despoit(double amout) {
        super.despoit(amout - 1);
    }

    @Override
    public void withdrow(double amount) {
        super.withdrow(amount + 1);
    }
}

class SavingAcoounrt extends BankAccount {
    private double rate = 0.01;
    private int count = 3;

    public SavingAcoounrt(int balance) {
        super(balance);
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void earnMonthlyInterset() {
        count = 3;
        super.despoit(super.getBalance() * rate);
    }

    @Override
    public void despoit(double amout) {
        if (count > 0) {
            super.despoit(amout);
            count--;
        } else {
            super.despoit(amout - 1);
        }

    }

    @Override
    public void withdrow(double amount) {
        if (count > 0) {
            super.withdrow(amount);
            count--;
        } else {
            super.withdrow(amount + 1);
        }

    }
}