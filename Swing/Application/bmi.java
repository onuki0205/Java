package Swing.Application;

import java.awt.*;
import javax.swing.*;

public class bmi {
    public static void main(String[] args) {
        // フレームの作成
        JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setLayout(new GridLayout(4, 2));

        // ラベルとテキストフィールドの作成
        JLabel heightLabel = new JLabel("Height (cm):");
        JTextField heightField = new JTextField();
        JLabel weightLabel = new JLabel("Weight (kg):");
        JTextField weightField = new JTextField();
        JLabel resultLabel = new JLabel("BMI:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // ボタンの作成
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(_ -> {
            try {

                String bmiStatus = "";
                // 入力値を取得
                double height = Double.parseDouble(heightField.getText()) / 100; // cm to m
                double weight = Double.parseDouble(weightField.getText());

                // BMIを計算
                double bmi = weight / (height * height);

                bmiStatus = getStatus(bmi);

                // 結果を表示
                resultField.setText(String.format("%.2f (%s)", bmi, bmiStatus));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        

        // コンポーネントをフレームに追加
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(calculateButton);

        // フレームを表示
        frame.setVisible(true);
    }
    
    private static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}