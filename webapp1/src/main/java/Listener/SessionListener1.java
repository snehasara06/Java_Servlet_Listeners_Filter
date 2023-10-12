package Listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener1 implements HttpSessionListener,HttpSessionAttributeListener {
static int sessionCount;
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
      System.out.println("HTTP SESSION CREATED");
      System.out.println(new java.util.Date());
      sessionCount++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("HTTP SESSION DESTROYED");
        System.out.println(new java.util.Date());
        sessionCount--;
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent arg0) {
        System.out.println("SESSION ATTRIBUTE");
        System.out.println("SESSION - Attribute added");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent arg0) {
        System.out.println(" SESSION - Attribute Removed");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent arg0) {
        System.out.println("SESSION - Attribute Replaced");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }
    
}
