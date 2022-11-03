public class Shape {
    public void abstractDraw() {
    }
}
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
}
class Cube extends Shape{
    void draw(){System.out.println("drawing cube");}
}
class Line extends Shape{
    void draw(){System.out.println("drawing Line");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
