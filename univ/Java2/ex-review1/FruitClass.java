abstract class Fruit {
	String name;

	Fruit() {}
	Fruit(String s) {name = s;}
	public void show() { System.out.println("Fruit: " + name); }
	abstract public void color() ;
}

class Apple extends Fruit {
	Apple() {}
	Apple(String s) {super(s);}
	public void show() { System.out.println("Apple: " + name); }
	public void color() { System.out.println("Color: Red or Green"); }
}

class Orange extends Fruit{
	Orange() {}
	Orange(String s) {super(s);}
	public void show() { System.out.println("Orange: " + name); }
	public void color() { System.out.println("Color: Orange or Yellow"); }
}

public class FruitClass {
	public static void main(String[] args) {
		Apple ap1 = new Apple("Ringo1");
		ap1.show();
		Apple myap;
		myap = ap1;
		myap.show();
		myap.color();
		Orange or1 = new Orange("Orange1");
		or1.show();
		Orange myor;
		myor = or1;
		myor.show();
		myor.color();
		Fruit ft;
		ft = myap;
		ft.show();
		ft.color();
		ft = or1;
		ft.show();
		ft.color();
		// Fruit ft2 = new Fruit("fruits 1");
		// ft2.show();
		Fruit myFruits[] = {
			new Apple("My Apple 1"),
			new Apple("My Apple 2"),
			new Apple("My Apple 3"),
			new Orange("My Orange 1"),
			new Orange("My Orange 2")
		};
		for ( Fruit f : myFruits) f.show();

	}
}

