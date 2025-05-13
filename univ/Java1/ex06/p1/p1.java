class Shape {
  private String name;
  public Shape(String name) {
    this.name = name;
  }
  public Shape() {
    name = "no name";
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return getClass().getName() + " " + name;
  }
}

class Circle extends Shape{
  private float radius;
  private float area,permeter;
  Circle(String name,float radius){
    super(name);
    this.radius = radius;
  }
  public float rPermeter(){
    return 2 * radius * (float)Math.PI;
  }
  public float rArea(){
    return radius * radius * (float)Math.PI;
  }
  public String toString() {
    return super.toString() + " radius : " + radius;
  }
}

class Rectangle extends Shape{
  private float side1,side2;
  Rectangle(String name,float side1,float side2){
    super(name);
    this.side1 = side1;
    this.side2 = side2;
  }

  public float rPermeter(){
    return side1 * 2 + side2 * 2;
  }
  public float rArea(){
    return side1 * side2;
  }
  public String toString() {
    return super.toString() + " side1 : " + side1 + " side2 : " + side2;
  }
}

class Square extends Rectangle{
  Square(String name,float side1){
    super(name,side1,0);
  }
  public float rPermeter(){
    return side1 * 4;
  }
  public float rArea(){
    return side1 * side1;
  }
  public String toString() {
    return  getClass().getName() + " " + getName() + " side : " + side1;
  }
}

class Parallelogram extends Rectangle{
  private float diagonal;
  private float s;
  Parallelogram(String name,float side1,float side2,float diagonal){
    super(name,side1,side2);
    this.diagonal = diagonal;
  }
  public float rPermeter(){
    return side1 * 2 + side2 * 2;
  }
  public float rArea(){
    s = (side1 + side2 + diagonal) / 2;

    return (float)Math.sqrt(s * (s - side1) * (s - side2) / (s - diagonal));
  }
  public String toString() {
    return super.toString() + " diagonal : " + diagonal;
  }
}

class Rhombus extends Square{
  private float diagonal;
  Rhombus(String name,float side1,float diagonal){
    super(name,side1);
    this.diagonal = diagonal;
  }
  public float rPermeter(){
    return side1 * 4;
  }
  public float rArea(){
    return diagonal * diagonal / 2;
  }
  public String toString() {
    return super.toString() + " diagonal : " + diagonal;

  }
}

class TestFigures{
  public static void main(String[] args){
    Circle circle = new Circle("circle",10f);
    Rectangle rectangle = new Rectangle("rectangle",5f,10f);
    Square square = new Square("square",10f);
    Parallelogram parallelogram = new Parallelogram("parallelogram",5f,3f,4f);
    Rhombus rhombus = new Rhombus("rhombus",6f,4f);

    System.out.println(circle.toString() + " permeter : " + circle.rPermeter() + " area : " + circle.rArea());
    System.out.println(rectangle.toString() + " permeter : " + rectangle.rPermeter() + " area : " + rectangle.rArea());
    System.out.println(square.toString() + " permeter : " + square.rPermeter() + " area : " + square.rArea());
    System.out.println(parallelogram.toString() + " permeter : " + parallelogram.rPermeter() + " area : " + parallelogram.rArea());
    System.out.println(rhombus.toString() + " permeter : " + rhombus.rPermeter() + " area : " + rhombus.rArea());

  }
}

