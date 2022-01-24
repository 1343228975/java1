package self_Study.object_oriented.encap;


class Account {
    private String name = "";
    private double balance;
    private String password;

    public Account() {

    }

    public Account(String name, double balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int lenth = name.length();
        if (lenth >= 2 && lenth <= 4) {
            this.name = name;
        } else {
            System.out.println("请输入2-4位的名字！！");
            this.name = "admin";
        }


    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {

            this.balance = balance;
        } else {
            System.out.println("余额必须大于20！！");
            this.balance = 100;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            this.password = "123456";
        }

    }
}