
import java.util.*;

public class Puddle {

    private static int n;
    private static int m;
    private static char[][] puddle;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading integers
        puddle = new char[n][m];

        // Read the puddle matrix
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                puddle[i][j] = line.charAt(j);
            }
        }
        // sample input
        // 10 12
        // #........##.
        // .###.....###
        // ....##...##.
        // .........##.
        // .........#..
        // ..#......#..
        // .#.#.....##.
        // #.#.#.....#.
        // .#.#......#.
        // ..#.......#.

        // dfs to count the number of puddles
        int puddleCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (puddle[i][j] == '#') {
                    dfs(i, j);
                    puddleCount++;           
                }
            }  
        }

        // Print the number of puddles
        System.out.println(puddleCount);
        sc.close();

    }

    public static void dfs(int x, int y){
        puddle[x][y] = '.';
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                if(i==0 && j==0) continue;
                int newX = x + i;
                int newY = y + j;
                if(newX >= 0 && newX < n && newY >= 0 && newY < m && puddle[newX][newY] == '#'){
                    dfs(newX, newY);
                }
            }
        }
    }
}
