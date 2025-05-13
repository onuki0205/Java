import java.math.*;

public class Bmi{
    public static double calculateBmi(double weight, double height){
        BigDecimal bmi = new BigDecimal(weight / (height * height) * 10000);
        return bmi.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static String getBmiCategory(double bmi){
        if(bmi < 18.5){
            return "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            return "Normal weight";
        }
        else if(bmi >= 25 && bmi <= 29.9){
            return "Overweight";
        }
        else{
            return "Obesity";
        }
    }
}