package _1_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

    public static void main(String[] args) {

        // Creating the Spring Container aka
        // Loading the XML Configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("_1_InversionOfControl/applicationContext.xml");

        // Retrieving a bean from the Spring Container
        Book myBook = context.getBean("myBook", Book.class);

        System.out.print("My favourite book is called: ");
        // Calling one of the bean's methods
        System.out.println(myBook.getBookTitle());

        // Closing the Spring Container
        context.close();

    }

}
