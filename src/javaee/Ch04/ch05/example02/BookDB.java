package javaee.Ch04.ch05.example02;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static Map<String,Book>boos = new LinkedHashMap<String,Book>();
    static {
        boos.put("1",new Book("1","javaweb开发1"));
        boos.put("2",new Book("1","javaweb开发2"));
        boos.put("3",new Book("1","javaweb开发3"));
        boos.put("4",new Book("1","javaweb开发4"));
        boos.put("5",new Book("1","javaweb开发5"));
    }
    public static Collection<Book> getAll(){
        return boos.values();
    }
    public static Book getBook(String id){
        return boos.get(id);
    }
}
