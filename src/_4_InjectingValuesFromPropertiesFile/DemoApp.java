package _4_InjectingValuesFromPropertiesFile;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {

        // try-catch block to catch the "BeansException"
        try
        {
            // Creating the Spring Container aka
            // Loading the XML Configuration file
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("_4_InjectingValuesFromPropertiesFile/applicationContext.xml");

            // Retrieving a bean from the Spring Container
            John john = context.getBean("myPerson", John.class);

            // Calling two of the bean's methods
            System.out.println("His name is " + john.getFirstName() + ", he is " + john.getAge() + " years old.");

            // Closing the Spring Container
            context.close();
        }
        catch(BeansException exception1)
        {
            exception1.printStackTrace();
        }

    }
}
