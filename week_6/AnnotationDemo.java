package week_6;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String info() default "Default info";
}

class AnnotationDemo {

    @MyAnnotation(info = "Test method annotation")
    public void testMethod() {
        System.out.println("Inside testMethod");
    }

    public static void main(String[] args) throws Exception {
        AnnotationDemo obj = new AnnotationDemo();
        obj.testMethod();

        MyAnnotation annotation = obj.getClass()
                                    .getMethod("testMethod")
                                    .getAnnotation(MyAnnotation.class);
        System.out.println("Annotation info: " + annotation.info());
    }
}

