package Annotation;

import javax.sound.midi.Sequence;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {    //creating Annotation
   public String testcase() default "testcase";

}

@interface info {    //creating Annotation


}
@info
class Developer{
    int DeveloperId;
    String DeveloperName;
    int Date;
    int Time;
    int Version;
    public Developer(int DeveloperId, String DeveloperName,int Date,int Time,int Version){
        this.DeveloperId=DeveloperId;
        this.DeveloperName=DeveloperName;
        this.Date=Date;
        this.Time=Time;
        this.Version=Version;
    }
    public static void main(String[] args){
        Developer developer=new Developer(1, "John",10,20,1);
        System.out.println("Developer ID:"+developer.DeveloperId);
        System.out.println("Developer name:"+developer.DeveloperName);
        System.out.println("Date:"+developer.Date);
        System.out.println("Time:"+developer.Time);
        System.out.println("Version:"+developer.Version);
    }
}
@interface Execute {
    int Sequence() default 1;    //creating Annotation


}
@Execute(Sequence=1)
class Customer {

    @Execute(Sequence = 2)
    void myMethod1() {
        System.out.println("Method1 called");
    }

    @Execute(Sequence = 1)
    void myMethod2() {
        System.out.println("Method2 called");
    }

    @Execute(Sequence = 3)
    void myMethod3() {
        System.out.println("Method3 called");
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.myMethod1();
        customer.myMethod2();
        customer.myMethod3();
    }
}