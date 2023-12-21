package com.meghabassi.singleton;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	 private static final Logger logger = LogManager.getLogger("App.class");
    public static void main( String[] args ) 
    {
        
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        logger.debug("Logging in singleton1 hashcode {} and  singleton2 hashcode {}",singleton.hashCode(),singleton2.hashCode());
          
        logger.trace("Comparison started Singleton and Singleton2");
        if(singleton==singleton2) {
        	System.out.println("Both instances of singleton point to same");
        	logger.printf(Level.INFO, "Both instances of singleton point to same");
           
        }
        else
        {
        	System.out.println("Something went wrong");
        	logger.error("Somethings went wrong. Both singleton and singleton2 should point to same object");
        }
        logger.trace("Comparison ended Singleton and Singleton2");
    }
}
