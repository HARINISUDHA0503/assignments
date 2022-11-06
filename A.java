package Annotation;

import java.util.ArrayList;
@FunctionalInterface // only allow one method
interface Abc{
    public void show();

    }

public class A {
    public void addAnnotation(){
        System.out.println("add A");
    }
}
class B extends A {
    @Deprecated    // stick out the method below
    public void add(){
     System.out.println("addition");
    }
    @SuppressWarnings("unchecked")
    @Override
    public void addAnnotation(){
        ArrayList a=new ArrayList();
        System.out.println("add B");
    }
}


