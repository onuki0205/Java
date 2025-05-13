import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class simpleGUI extends JFrame implements ActionListener {
    private JTextField heightField;
    private JTextField weightField;
    private JTextArea resultArea;

    public simpleGUI() {
        super("BMI計算アプリ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        // 入力パネル
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("身長 (cm):"));
        heightField = new JTextField(10);
        inputPanel.add(heightField);
        inputPanel.add(new JLabel("体重 (kg):"));
        weightField = new JTextField(10);
        inputPanel.add(weightField);

        // 計算ボタン
        JButton calculateButton = new JButton("BMIを計算");
        calculateButton.addActionListener(this);

        // 結果表示エリア
        resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        // コンポーネントの配置
        add(inputPanel, BorderLayout.NORTH);
        add(calculateButton, BorderLayout.CENTER);
        add(new JScrollPane(resultArea), BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double height = Double.parseDouble(heightField.getText()) / 100; // cmをmに変換
            double weight = Double.parseDouble(weightField.getText());
            double bmi = weight / (height * height);

            String result = String.format("BMI: %.2f\n", bmi);
            if (bmi < 18.5) {
                result += "低体重";
            } else if (bmi < 25) {
                result += "普通体重";
            } else if (bmi < 30) {
                result += "肥満（1度）";
            } else if (bmi < 35) {
                result += "肥満（2度）";
            } else if (bmi < 40) {
                result += "肥満（3度）";
            } else {
                result += "肥満（4度）";
            }

            resultArea.setText(result);
        } catch (NumberFormatException ex) {
            resultArea.setText("数値を正しく入力してください");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            simpleGUI frame = new simpleGUI();
            frame.setVisible(true);
        });
    }
}