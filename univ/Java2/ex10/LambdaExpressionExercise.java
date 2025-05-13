import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LambdaExpressionExercise {
    public static void main(String args[]) {
        LambdaExpressionExercise tester = new LambdaExpressionExercise();
        
        MathOperation thirdPower = (double x) -> x * x * x;
        MathOperation squreRoot = (double x) -> {Math.sqrt(x);};
        MathOperation power = (double x, double y) -> {Math.pow(x, y);};
        
        MathOperation score = (double x) -> {PassFailService.showMessage(x);};



        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;
        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10 + 5 = " + tester.operate(10, 5,
        addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5,
        subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5,
        multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5,
        division));

        System.out.println("x * x * x = " + tester.operate(x, mathOperation));
        System.out.println("squre root of x = " + tester.operate(x, mathOperation));
        System.out.println("x powered by y = " + tester.operate(x,y, mathOperation));
        System.out.println("passFailService = " + tester.operate(x, mathOperation));
        System.out.println("passFailService = " + tester.operate(x, mathOperation));
        
        //without parenthesis
        GreetingService greetService1 = message ->
        System.out.println("Hello " + message);
        //with parenthesis
        GreetingService greetService2 = (message) ->
        System.out.println("Hello " + message);
        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }
    
    interface MathOperation {
        int operation(int a, int b);
    }
    interface MathOperation {
        int operation(double a, double b);
    }
    interface MathOperation {
        int operation(double a);
    }
    
    interface GreetingService {
        void sayMessage(String message);
    }

    interface PassFailService {
        void showMessage(double x);
    }
    
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}