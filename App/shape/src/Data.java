package shape.src;

import java.util.*;

public class Data {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private int size = 0;


    public void addShape(Shape shape){
        this.shapes.add(shape);
        this.size++;
    }

    public void removeShape(String name){
        for(Shape shape : this.shapes){
            if(shape.getName().equals(name)){
                this.shapes.remove(shape);
                this.size--;
                return;
            }
        }
        System.out.println("not found.");
    }

    public int getSize(){
        return this.size;
    }

    public void showAllShapes(){
        for(Shape shape : this.shapes){
            System.out.println(shape.toString());
        }
    }
}
