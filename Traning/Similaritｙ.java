import java.util.*;

public class Similaritｙ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxLength = Math.max(maxLength,calculateSimilarity(str[i], str[j]));
            }
        }

        System.out.println(maxLength);
        sc.close();

    }

    // 共通する最長の連続部分文字列の長さを求めるメソッド
    public static int calculateSimilarity(String str1, String str2) {
        int maxLength = 0;
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }
        return maxLength;
    }

}