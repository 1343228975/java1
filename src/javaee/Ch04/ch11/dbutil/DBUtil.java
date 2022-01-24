package javaee.Ch04.ch11.dbutil;

import javaee.Ch04.ch11.domain.UserBean;

import java.util.HashMap;

public class DBUtil {
    private static DBUtil instance = new DBUtil();   //

    private HashMap<String, UserBean> users = new HashMap<String,UserBean>();
    private DBUtil() {


    }
    public static DBUtil getInstance()	{
        return instance;
    }

    public UserBean getUser(String userName) {
        UserBean user = (UserBean) users.get(userName);
        return user;
    }

    public boolean insertUser(UserBean user) {
        if(user == null) {
            return false;
        }
        String userName = user.getName();
        if(users.get(userName) != null) {
            return false;
        }
        users.put(userName,user);
        return true;
    }
}
