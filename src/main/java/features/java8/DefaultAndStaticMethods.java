package features.java8;

interface baseI {
    public void m1();
    public void m2();
    //if a new method is to be added in an interface,
    //then its implementation code has to be provided in the class implementing the same interface.
    // for example public void m3();
    //This is allowed in Java - 8 , Default methods are also known as defender methods or virtual extension methods.
    default void m3(){}
    static void m4(){}
}

public class DefaultAndStaticMethods implements baseI{
    /**
     * Before Java 8, interfaces could have only abstract methods.
     * The implementation of these methods has to be provided in a separate class.
     * So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface.
     * To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without
     * affecting the classes that implement the interface.
     */
    public void m1(){
        //Method Definition
        System.out.println("m1 method");

    }
    public void m2() {
        //Method Definition
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        DefaultAndStaticMethods ob=new DefaultAndStaticMethods();
        ob.m1();ob.m2();
    }
}
