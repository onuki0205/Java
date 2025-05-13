package shape.src;

public class Triangle extends Shape {
    private float base;
    private float height;

    public Triangle(String name, float base, float height, String color){
        super(name,(float)(0.5 * base * height),color);
        this.base = base;
        this.height = height;
    }

    public float getBase(){
        return this.base;
    }

    public float getHeight(){
        return this.height;
    }

    @Override
    public String toString(){
        return "name: " + this.name + " base: " + this.base + " height: " + this.height + " area: " + this.area + " color: " + this.color;
    }
}
