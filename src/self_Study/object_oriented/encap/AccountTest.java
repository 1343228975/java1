package self_Study.object_oriented.encap;

public class AccountTest extends Account{
    public static void main(String[] args) {

        Account account= new Account("赵伦", 1000, "123456");
        System.out.println(account.getName() + "  " + account.getBalance() + "  " + account.getPassword());

    }
}