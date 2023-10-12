package Listener;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

        System.out.println("CONTEXT DESTROYED");
        String path = arg0.getServletContext().getRealPath("listeners.txt");

        try {
            PrintWriter out = new PrintWriter(path);
            out.print(RequestListener.count);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {

        System.out.println("CONTEXT INITIALIZED");
        String path = arg0.getServletContext().getRealPath("listeners.txt");
        try {
    // opening the file with 'br' obj
    // initialize it with a FileReader- reads file from the file located at the 'path'
            BufferedReader br = new BufferedReader(new FileReader(path));
    // reading the file
    // variable 's' holds the contents of 1st line of the file
            String s = br.readLine();
            if (s != null) {

                int c = Integer.parseInt(s);
                RequestListener.count = c;
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        System.out.println("Servlet Context Attribute-Attribute added");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        System.out.println("Servlet Context Attribute-Attribute removed");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("Servlet Context AttributeAttribute replaced");
        System.out.println(arg0.getName());
        System.out.println(arg0.getValue());
    }

}
