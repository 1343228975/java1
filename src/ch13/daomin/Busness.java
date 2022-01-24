package ch13.daomin;

import java.util.ArrayList;
import java.util.List;

public class Busness {
    private String name ;
    private List<Busness> busnesses= new ArrayList<Busness>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    private String telphone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphne) {
        this.telphone = telphne;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Order [id="+id+"name="+name+"tel="+telphone+"email="+email+"]";
    }

}
