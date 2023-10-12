package Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CarListener  implements ServletContextListener{

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("Car Destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Car initialized");

        ServletContext context=arg0.getServletContext();

        String carName=context.getInitParameter("name");
      
        Car c=new Car(carName);
        context.setAttribute("car", c);
    }
    
}
