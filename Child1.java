package Inheritance;

public class Child1 extends Parent {
    int age=7;
    public static void main(String []args){
        Child1 ch=new Child1();
        ch.play();
        ch.work();
        System.out.println(ch.age);

    }
    public void work(){
        System.out.println(" child is working..");
    }
    public void play(){
        System.out.println("playing..");
    }
    public void study(){
        System.out.println("studying..");
    }
}
