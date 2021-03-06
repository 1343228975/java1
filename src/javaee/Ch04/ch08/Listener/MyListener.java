package javaee.Ch04.ch08.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class MyListener implements
        ServletContextListener, HttpSessionListener, ServletRequestListener {
    public void contextInitialized(ServletContextEvent arg0) {

        System.out.println("ServletContext对象被创建了");
    }

    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContext对象被销毁了");
    }

    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println("ServletRequest对象被创建了");
    }

    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("ServletRequest对象被销毁了");
    }

    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("HttpSession对象被创建了");
    }

    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("HttpSession对象被销毁了");
    }
}
