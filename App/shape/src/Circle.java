package shape.src;

public class Circle extends Shape{
    private float radius;

    public Circle(String name, float radius, String color){
        super(name, (float)(Math.PI * Math.pow(radius,2)), color);
        this.radius = radius;
    }

    public float getRadius(){
        return this.radius;
    }

    public float getPerimeter() {
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return "name: " + this.name + " radius: " + this.radius + " area: " + this.area + " color: " + this.color;
    }
} 