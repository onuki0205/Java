package shape.src;

abstract public class Shape{
    protected String name;
    protected float area;
    protected String color;

    public Shape(String name, float area, String color){
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }   

    public float getArea(){
        return this.area;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "Name: " + this.name + " Area: " + this.area + " Color: " + this.color;
    }
}
