package javaee.Ch04.ch09;

public class FindUserByidtest {
    public static void main(String[] args) {
        UsersDao usersDao = new UsersDao();
        User user = usersDao.find(1);
        System.out.println("id为1的User对象的name值为：" + user.getUsername());
    }
}
