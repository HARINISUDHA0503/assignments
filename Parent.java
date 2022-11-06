package Inheritance;

public class Parent {
    public int age=25;
    public static void main(String []args){

       Parent p=new Parent();
       p.work();
    }
        public void work(){
            System.out.println("Working..");
    }
    public void cook(){
            System.out.println("cooking..");
        }
    }

