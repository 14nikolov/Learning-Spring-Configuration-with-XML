package _5_BeanScopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {

        // Loading XML Config File a.k.a.
        // Creating a Spring Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("_5_BeanScopes/applicationContext.xml");

        // Retrieving a Singleton Bean from the Spring Container
        Car car1 = context.getBean("carSingletonScopeBean", Car.class);
        Car car2 = context.getBean("carSingletonScopeBean", Car.class);
        // Retrieving a Prototype Bean from the Spring Container
        Car car3 = context.getBean("carPrototypeScopeBean", Car.class);
        Car car4 = context.getBean("carPrototypeScopeBean", Car.class);

        // Calling the Bean's method
        System.out.println("This is a " + car1.getCarBrand() + " " + car2.getCarModel() +
                "it's an affordable and reliable car.");

        // Comparing the memory addresses of
        // 2 instances of a Singleton Scope Bean
        System.out.println();
        boolean objectComparison1 = (car1==car2);
        System.out.println("The objects car1 and car2 have the same memory address? " + objectComparison1);

        // Comparing the memory addresses of
        // 2 instances of a Prototype Scope Bean
        System.out.println();
        boolean objectComparison2 = (car3==car4);
        System.out.println("The objects car3 and car4 have the same memory address? " + objectComparison2);


        // Closing the Spring Container
        context.close();
    }
}
