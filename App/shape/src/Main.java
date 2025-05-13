package shape.src;

import java.util.*;

public class Main { 
    public static void main(String[] args){
        Data data = new Data();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("The Shape Program");
            while (true) {
                System.out.println("Input command: add, remove, list, exit");

                String command = scanner.nextLine();
                
                switch (command) {
                    case "exit" -> System.exit(0);
                    case "add" -> {
                        System.out.println("Input shape: circle, triangle");
                        String shape = scanner.nextLine();
                        if (shape.equals("circle")) {
                            System.out.println("Input shape name: ");
                            String name = scanner.nextLine();
                            System.out.println("Input radius: ");
                            float radius = Float.parseFloat(scanner.nextLine());
                            System.out.println("Input color: ");
                            String color = scanner.nextLine();
                            data.addShape(new Circle(name, radius, color));
                        } else if (shape.equals("triangle")) {
                            System.out.println("Input shape name: ");
                            String name = scanner.nextLine();
                            System.out.println("Input base: ");
                            float base = Float.parseFloat(scanner.nextLine());
                            System.out.println("Input height: ");
                            float height = Float.parseFloat(scanner.nextLine());
                            System.out.println("Input color: ");
                            String color = scanner.nextLine();
                            data.addShape(new Triangle(name, base, height, color));
                        }
                    }
                    case "remove" -> {
                        data.showAllShapes();
                        System.out.println("Input shape name");
                        String name = scanner.nextLine();
                        data.removeShape(name);
                    }
                    case "list" -> {
                        System.out.println("List Size: " + data.getSize());
                        data.showAllShapes();
                    }
                    default -> throw new AssertionError();
                }
            }
        }
    }
} 