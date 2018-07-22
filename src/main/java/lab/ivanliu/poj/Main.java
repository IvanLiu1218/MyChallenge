package lab.ivanliu.poj;

import java.util.Scanner;

/** Java 1.5 */
public class Main {

    private static Main solution = new Main();

    public static void main(String[] args) throws Exception {
        solution.poj2386();
    }

    public void poj2386() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int M = cin.nextInt();
        cin.nextLine();
        char[][] lake = new char[N][M];
        for (int i = 0; i < N; ++i) {
            String line = cin.nextLine();
            lake[i] = line.toCharArray();
        }
        int num = poj2386(lake);
        System.out.println(num);
    }
    public int poj2386(char[][] lake) {
        int num = 0;
        for (int i = 0; i < lake.length; ++i) {
            for (int j = 0; j < lake[i].length; ++j) {
                if (lake[i][j] == 'W') {
                    poj2386_dfs(lake, i, j);
                    ++num;
                }
            }
        }
        return num;
    }
    public void poj2386_dfs(char[][] lake, int x, int y) {
        lake[x][y] = '.';
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (0 <= x + i && x + i < lake.length
                        && 0 <= y + j && y + j < lake[0].length
                        && lake[x + i][y + j] == 'W') {
                    poj2386_dfs(lake, x + i, y + j);
                }
            }
        }
    }
}
