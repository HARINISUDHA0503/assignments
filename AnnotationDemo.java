package Annotation;

import java.lang.annotation.*;

//Marker annotation don't have any variables
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{    //creating Annotation
    String os() default "Symbian";        //Single value Annotation
    int version() default 1;              //Multiple values Annotation
}
//if you don't provide an annotation with Smartphone you cannot call Nokia as Smartphone

@SmartPhone                              //using Annotation and specify values for version and os
 class Nokia{
    String model;                        //creating variables to this class
    int size;


    public Nokia(String model, int size){ //creating constructor
        this.model = model;
        this.size = size;
    }

}
public class AnnotationDemo {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("Android",4);  //creating object for Nokia class
        System.out.println(nokia.model);
        System.out.println(nokia.size);
        Class c= nokia.getClass();                        //creating Class object for annotation
        Annotation an=c.getAnnotation(SmartPhone.class) ; //creating object of annotation
        SmartPhone s= (SmartPhone)an;                     // 'an' is annotation
        System.out.println(s.os());
        System.out.println(s.version());
    }
}
