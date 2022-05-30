package _6_BeanLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp2 {

    public static void main(String[] args) {

        // Loading XML Config File a.k.a.
        // Creating a Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("_6_BeanLifecycle/PrototypeScopeBeansExclusionRegardingDestroyMethod.xml");

        // Retrieving a Bean from the Spring Container
        Cat cat = context.getBean("cat", Cat.class);

        // Calling the Bean's method and
        // printing out the returned value
        // IMPORTANT: The Pre Destroy Method does not work, if our Bean has a Prototype Scope
        // However, there is a way to make it work, but we have to do it manually
        System.out.println(cat.meow());

        // Closing the Spring Container
        context.close();

    }

}
