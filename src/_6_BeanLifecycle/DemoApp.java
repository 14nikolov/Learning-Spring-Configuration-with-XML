package _6_BeanLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

    public static void main(String[] args) {

        // Loading XML Config File a.k.a.
        // Creating a Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("_6_BeanLifecycle/applicationContext.xml");

        // Retrieving a Bean from the Spring Container
        Dog dog = context.getBean("dog", Dog.class);

        // Calling the Bean's method and
        // printing out the returned value
        // The Post Constructor and Pre Destroy Methods are called automatically,
        // because we have set them up in the XML Configuration
        System.out.println(dog.bark());

        // Closing the Spring Container
        context.close();

    }

}
