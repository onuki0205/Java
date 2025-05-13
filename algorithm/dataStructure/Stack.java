package algorithm.dataStructure;

public class Stack{
    private int[] stackArray;
    private int size;
    private int top = -1;

    public Stack(int size){
        stackArray = new int[size];
        this.size = size;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[top++] = value;
            System.out.println("Pushed " + value + " to stack.");
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // or throw an exception
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from stack.");
            return value;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}