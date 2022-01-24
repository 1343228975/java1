package javaee.Ch04.ch11.domain;

import java.util.HashMap;
import java.util.Map;

public class ReginsterFormBean {
    private String name;
    private String password;
    private String password2;
    private String email;

    private Map<String, String> errors = new HashMap<String, String>();

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate() {
        boolean flag = true;
        if (name == null || name.trim().equals("")) {
            errors.put("name", "请输入姓名.");
            flag = false;
        }
        if (password == null || password.trim().equals("")) {
            errors.put("password", "请输入密码.");
            flag = false;
        } else if (password.length() > 12 || password.length() < 6) {
            errors.put("password", "请输入6-12个字符.");
            flag = false;
        }
        if (password != null && !password.equals(password2)) {
            errors.put("password2", "两次输入的密码不匹配.");
            flag = false;
        }
        // 对email格式的校验采用了正则表达式
        if (email == null || email.trim().equals("")) {
            errors.put("email", "请输入邮箱.");
            flag = false;
        } else if (!email.matches("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+")) {
            errors.put("email", "邮箱格式错误.");
            flag = false;
        }
        return flag;
    }


    public void setErrorMsg(String err, String errMsg) {
        if ((err != null) && (errMsg != null)) {
            errors.put(err, errMsg);
        }
    }


    public Map<String, String> getErrors() {
        return errors;
    }
}
