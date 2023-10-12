package Listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    public static int count;
    static {
        System.out.println("\n Request Listener Class");
        System.out.println("\n Request Attribute Listener Class");
    }

    public RequestListener() {
        System.out.println("\n Request Listener Object");
        System.out.println("\n Request Attribute Listener Object");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("\nDestroyed: " + new java.util.Date());
        System.out.println("\nREQUEST DESTROYED");
        System.out.println(arg0.getSource().toString());
        System.out.println(arg0.getClass());
        System.out.println(arg0.getServletContext());
        System.out.println(arg0.getServletRequest());
        System.out.println();

    }

    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        count++;
        System.out.println();

        System.out.println("Initialized: " + new java.util.Date());
        System.out.println("\n REQUEST INITIALIZED");
        System.out.println(arg0.getSource());
        System.out.println(arg0.getClass());
        System.out.println(arg0.getServletContext());
        System.out.println(arg0.getServletRequest());
        System.out.println();

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent arg0) {
        System.out.println("\nATTRIBUTE ADDED");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent arg0) {
        System.out.println("\nATTRIBUTE REMOVED");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent arg0) {
        System.out.println("\nATTRIBUTE REPLACED");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

}
