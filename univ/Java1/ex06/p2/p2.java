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

  public boolean equals(Object obj) {
    if (obj == null){
      return false;
    } else if (super.equals(obj)){
      return true;
    }else if (getClass() == obj.getClass()) {
      Shape a = (Shape)obj;
      return a.getName() == name;
    } else
      return false;
  }
}

class Circle extends Shape{
  private float radius;
  private float area,permeter;
  Circle(String name,float radius){
    super(name);
    this.radius = radius;
  }
  public float getRadious(){
    return radius;
  }
  public float rPermeter(){
    permeter = 2 * radius * (float)Math.PI;
    return permeter;
  }
  public float rArea(){
    area = radius * radius * (float)Math.PI;
    return area;
  }
  public String toString() {
    return super.toString() + " radius : " + getRadious();
  }

  public boolean equals(Object obj) {
      Circle a = (Circle)obj;
      return a.getRadious() == radius && a.rPermeter() == permeter && a.rArea() == area;
  }
}

class Parallelogram extends Shape{
  private float diagonal,permeter,area;
  private float s,side1,side2;
  Parallelogram(String name,float side1,float side2,float diagonal){
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.diagonal = diagonal;
  }
  public float getSide1(){
    return side1;
  }
  public float getSide2(){
    return side2;
  }
  public float getDiagonal(){
    return diagonal;
  }
  public float rPermeter(){
    return permeter = side1 * 2 + side2 * 2;
  }
  public float rArea(){
    s = (side1 + side2 + diagonal) / 2;

    return area = (float)Math.sqrt(s * (s - side1) * (s - side2) / (s - diagonal));
  }
  public String toString() {
    return super.toString();
  }
  public boolean equals(Object obj) {
      Parallelogram a = (Parallelogram)obj;
      return a.getSide1() == side1 && a.getSide2() == side2 && a.getDiagonal() == diagonal && a.rPermeter() == permeter && a.rArea() == area;
  }
}

class Rectangle extends Parallelogram{
  float permeter,area,side1,side2;
  Rectangle(String name,float side1,float side2){
    super(name,side1,side2,(float)Math.sqrt(side1*side1+side2*side2));
  }
  public float getSide1(){
    return side1;
  }
  public float getSide2(){
    return side2;
  }
  public float rPermeter(){
    return permeter = side1 * 2 + side2 * 2;
  }
  public float rArea(){
    return area = side1 * side2;
  }
  public String toString() {
    return super.toString() + " side1 : " + getSide1() + " side2 : " + getSide2();
  }
  public boolean equals(Object obj) {
      Parallelogram a = (Parallelogram)obj;
      return a.getSide1() == side1 && a.getSide2() == side2 && a.rPermeter() == permeter && a.rArea() == area;
  }
}

class Square extends Rectangle{
  private float permeter,area;
  Square(String name,float side1){
    super(name,side1,side1);
  }
  public float getSide1(){
    return side1;
  }
  public float rPermeter(){
    return permeter = side1 * 4;
  }
  public float rArea(){
    return area = side1 * side1;
  }
  public String toString() {
    return  getClass().getName() + " " + getName() + " side : " + getSide1();
  }
  public boolean equals(Object obj) {
      Parallelogram a = (Parallelogram)obj;
      return a.getSide1() == side1 && a.rPermeter() == permeter && a.rArea() == area;
  }
}

class Rhombus extends Square{
  private float diagonal,permeter,area;

  Rhombus(String name,float side1,float diagonal){
    super(name,side1);
    this.diagonal = diagonal;
  }
  public float getSide1(){
    return side1;
  }
  public float getDiagonal(){
    return diagonal;
  }
  public float rPermeter(){
    return permeter = side1 * 4;
  }
  public float rArea(){
    return area = diagonal * diagonal / 2;
  }
  public String toString() {
    return super.toString() + " diagonal : " + getDiagonal();
  }
  public boolean equals(Object obj) {
      Rhombus a = (Rhombus)obj;
      return a.getSide1() == side1 && a.getDiagonal() == diagonal && a.rPermeter() == permeter && a.rArea() == area;
  }
}

class TestFigures{
  public static void main(String[] args){
    Circle circle = new Circle("circle",10f);
    Rectangle rectangle = new Rectangle("rectangle",10f,10f);
    Square square = new Square("square",10f);
    Parallelogram parallelogram = new Parallelogram("parallelogram",5f,3f,4f);
    Rhombus rhombus = new Rhombus("rhombus",6f,4f);



    System.out.println(circle.toString() + " permeter : " + circle.rPermeter() + " area : " + circle.rArea());
    System.out.println(rectangle.toString() + " permeter : " + rectangle.rPermeter() + " area : " + rectangle.rArea());
    System.out.println(square.toString() + " permeter : " + square.rPermeter() + " area : " + square.rArea());
    System.out.println(parallelogram.toString() + " diagonal : " + parallelogram.getDiagonal()+ " permeter : " + parallelogram.rPermeter() + " area : " + parallelogram.rArea());
    System.out.println(rhombus.toString() + " permeter : " + rhombus.rPermeter() + " area : " + rhombus.rArea());

   
    System.out.println(rectangle.equals(square));
    System.out.println(rectangle.equals(parallelogram));
    System.out.println(rectangle.equals(rhombus));
    System.out.println(square.equals(parallelogram));
    System.out.println(square.equals(rhombus));
  }
}
