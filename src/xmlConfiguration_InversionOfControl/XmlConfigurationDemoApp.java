package xmlConfiguration_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationDemoApp {

    public static void main(String[] args) {

        // Creating the Spring Container aka
        // Loading the XML Configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("xmlConfiguration_InversionOfControl/xmlConfiguration_InversionOfControl.xml");

        // Retrieving a bean from the Spring Container
        Book myBook = context.getBean("myBook", Book.class);

        System.out.print("My favourite book is called: ");
        // Calling one of the bean's methods
        System.out.println(myBook.getBookTitle());

        // Closing the Spring Container
        context.close();

    }

}
