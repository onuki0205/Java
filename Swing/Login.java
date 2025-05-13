import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    public Login() {
        // ウィンドウの設定
        setTitle("ログイン");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // パネルの作成
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // ユーザー名入力
        panel.add(new JLabel("ユーザー名:"));
        usernameField = new JTextField();
        panel.add(usernameField);
        
        // パスワード入力
        panel.add(new JLabel("パスワード:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);
        
        // ログインボタン
        JButton loginButton = new JButton("ログイン");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                // ログイン処理
                if (username.equals("admin") && password.equals("password")) {
                    // ログイン成功時
                    dispose(); // ログイン画面を閉じる
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new simpleGUI().setVisible(true); // SimpleGUIを表示
                        }
                    });
                } else {
                    JOptionPane.showMessageDialog(Login.this, "ユーザー名またはパスワードが間違っています。", 
                        "エラー", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(loginButton);
        
        // パネルをフレームに追加
        add(panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
