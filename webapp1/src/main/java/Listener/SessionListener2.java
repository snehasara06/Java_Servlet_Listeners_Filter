package Listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class SessionListener2 implements HttpSessionBindingListener,HttpSessionActivationListener {


    @Override
    public void valueBound(HttpSessionBindingEvent arg0) {
        System.out.println("Session object has  added  to the Session scope : bound ");

    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        System.out.println("Session object has removed to the Session scope : unbound ");

    }

    @Override
    public void sessionDidActivate(HttpSessionEvent arg0) {
        System.out.println("Session did ********************activate********************: " + arg0.getSession().getId());

    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent arg0) {
        System.out.println("Session will passivate: " + arg0.getSession().getId());

    }
    
}
