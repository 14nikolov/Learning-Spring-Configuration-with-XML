package _6_BeanLifecycle;

public class Dog {

    // Post Constructor a.k.a. init-method
    // The Post Constructor method's code gets executed after the code in the Constructor,
    // hence the name Post Constructor Method.
    // (You can name it whatever you want,
    // the important thing is to say in the XML Configuration file,
    // which method you would like to use as a Post Constructor Method
    public void postConstruct(){
        System.out.println("Post Constructor Method of the Dog class");
    }

    // Pre Destroy a.k.a. destroy-method
    // The Pre Destroy method's code gets executed, in the following conditions:
    // at the end of a Bean's Lifecycle, before the shutdown of an Application or
    // before the closing of the Spring Container, hence the name Pre Destroy Method.
    // IMPORTANT: The Pre Destroy Method does not work, if our Bean has a Prototype Scope
    // However, there is a way to make it work, but we have to do it manually
    // (You can name it whatever you want,
    // the important thing is to say in the XML Configuration file,
    // which method you would like to use as a Pre Destroy Method
    public void preDestroy(){
        System.out.println("Pre Destroy Method of the Dog class");
    }

    public String bark(){
        return "Woof woof! WOOF!";
    }

}
