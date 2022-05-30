package xmlConfiguration_DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp2 {

    public static void main(String[] args) {

        // Creating the Spring Container aka
        // Loading the XML Configuration file
        //
        //
        // These 2 lines of code load the ConstructorDependencyInjection.xml configuration file
        // ClassPathXmlApplicationContext context =
        //         new ClassPathXmlApplicationContext("xmlConfiguration_DependencyInjection/ConstructorDependencyInjection.xml");
        //
        // These 2 lines of code load the SetterDependencyInjection.xml configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlConfiguration_DependencyInjection/SetterDependencyInjection.xml");

        // Retrieving a bean from the Spring Container
        Person myPerson = context.getBean("myPerson", Person.class);

        // Calling two of the bean's methods
        System.out.println("My name is " + myPerson.getPersonName() + ".");
        System.out.println("I think you should read " + myPerson.getPersonFavoriteBookTitle() +
                ", it's my favorite book and I think you will love it!");

        // Closing the Spring Container
        context.close();

    }

}
