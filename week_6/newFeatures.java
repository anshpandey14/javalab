package week_6;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

interface CheckEmpty {
    boolean isEmpty(String s);
}

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method called");
    }

    static void staticMethod() {
        System.out.println("Static method called");
    }
}

class LambdaEmptyCheck {
    public static void test() {
        CheckEmpty check = s -> s.isEmpty();
        System.out.println(check.isEmpty(""));    // true
        System.out.println(check.isEmpty("abc")); // false
    }
}

class MethodReferenceDemo {
    public static void printMessage() {
        System.out.println("Hello from method reference!");
    }

    public static void test() {
        Runnable r = MethodReferenceDemo::printMessage;
        r.run();
    }
}

class DefaultStaticDemo implements MyInterface {
    public static void test() {
        DefaultStaticDemo obj = new DefaultStaticDemo();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }
}

class Outer {
    class Inner {
        void display() {
            System.out.println("Inner class method");
        }
    }

    public void test() {
        Outer.Inner inner = this.new Inner();
        inner.display();
    }
}

// The main public class - file name must be Week6Demo.java
public class newFeatures {
    public static void main(String[] args) {
        System.out.println("LambdaEmptyCheck:");
        LambdaEmptyCheck.test();

        System.out.println("\nMethodReferenceDemo:");
        MethodReferenceDemo.test();

        System.out.println("\nDefaultStaticDemo:");
        DefaultStaticDemo.test();

        System.out.println("\nOuter class Inner:");
        Outer outer = new Outer();
        outer.test();
    }
}
