class TestRelatable{
    public static void main(String[] args) {
        MyRectangle a = new MyRectangle();
        RectanglePlus r1 = new RectanglePlus(10, 20);
		    RectanglePlus r2 = new RectanglePlus(40, 50);
		switch (r1.isLargerThan(r2)) {
			case 1:
				System.out.println("r1 is greater than r2");
				break;
			case 0:
				System.out.println("r1 is equal to r2");
				break;
			default:
				System.out.println("r1 is less than r2");
				break;

		}

		System.out.println(a.findLargest());

    }
}

