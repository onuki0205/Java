
import java.util.*;

public class Shooting{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[h][w];

        //n回の入力
        for(int i = 0; i < n; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            //r,cの位置にpを代入
            array[r][c] = p;
            
            //8方向入力
            for(int dx = -1; dx <= 1; dx++) {
               for(int dy = -1; dy <= 1; dy++) {
                    if(dx == 0 && dy == 0) continue;
                    int x = r + dx;
                    int y = c + dy;
                    if(x >= 0 && x < h && y >= 0 && y < w) {
                        array[x][y] = q;
                    }
                } 
            }

        }

        int count = 0;
        int m = sc.nextInt();
        for(int j = 0; j < m; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            count += array[a][b];
        }
        System.out.println(count);
        sc.close();


    }
}