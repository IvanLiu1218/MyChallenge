package lab.ivanliu.poj;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 *  挑战程序设计竞赛(第2版)
 */
public class Solution {

    public void poj1000() {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = poj1000(a, b);
        System.out.println(c);
    }

    public int poj1000(int a, int b) {
        return a + b;
    }

    /**
     *  POJ: 1852
     *  Book: 1.6.2, P18
     */
    public void poj1852() {
        Scanner cin = new Scanner(System.in);
        int cases = cin.nextInt();
        int[] minTime = new int[cases];
        int[] maxTime = new int[cases];
        for (int c = 0; c < cases; ++c) {
            int L = cin.nextInt();
            int n = cin.nextInt();
            int[] ants = new int[n];
            for (int i = 0; i < n; ++i) {
                ants[i] = cin.nextInt();
            }
            int[] time = poj1852(L, ants);
            minTime[c] = time[0];
            maxTime[c] = time[1];
        }
        for (int i = 0; i < cases; ++i) {
            System.out.println(minTime[i] + " " + maxTime[i]);
        }
    }
    public int[] poj1852(int L, int[] ants) {
        int mint = Integer.MIN_VALUE;
        for (int i = 0; i < ants.length; ++i) {
            int t = Math.min(ants[i], L - ants[i]);
            if (t > mint) mint = t;
        }
        int maxt = Integer.MIN_VALUE;
        for (int i = 0; i < ants.length; ++i) {
            int t = Math.max(ants[i], L - ants[i]);
            if (t > maxt) maxt = t;
        }
        return new int[] {mint, maxt};
    }

    /**
     *  POJ: 2386
     *  Book: 2.1.4, P32
     */
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

    /**
     *  POJ: XXX1
     *  Book: 2.1.5, P34
     */
    public static class MazePoint {
        public int x;
        public int y;
        public MazePoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int pojXXX1(char[][] maze, int x1, int y1, int x2, int y2) {
        int[][] steps = new int[maze.length][];
        for (int i = 0; i < maze.length; ++i) {
            steps[i] = new int[maze[i].length];
            Arrays.fill(steps[i], Integer.MIN_VALUE);
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = { 0, 0,-1, 1};
        steps[x1][y1] = 0;
        Deque<MazePoint> queue = new ArrayDeque<>();
        queue.offerLast(new MazePoint(x1, y1));
        while (!queue.isEmpty()) {
            MazePoint p = queue.pollFirst();
            for (int i = 0; i < dx.length; ++i) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (0 <= nx && nx < maze.length && 0 <= ny && ny < maze[0].length
                        && maze[nx][ny] != '#' && steps[nx][ny] == Integer.MIN_VALUE) {
                    queue.offerLast(new MazePoint(nx, ny));
                    steps[nx][ny] = steps[p.x][p.y] + 1;
                }
            }
        }
        return steps[x2][y2];
    }
}
