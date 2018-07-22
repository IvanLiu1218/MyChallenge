package lab.ivanliu.poj;

import java.util.Scanner;

/** Java 1.5 */
public class Main {

    private static Main solution = new Main();

    public static void main(String[] args) throws Exception {
        solution.poj1852();
    }

    private int[] minTime;
    private int[] maxTime;
    public void poj1852() {
        Scanner cin = new Scanner(System.in);
        int cases = cin.nextInt();
        minTime = new int[cases];
        maxTime = new int[cases];
        for (int c = 0; c < cases; ++c) {
            int L = cin.nextInt();
            int n = cin.nextInt();
            int[] ants = new int[n];
            for (int i = 0; i < n; ++i) {
                ants[i] = cin.nextInt();
            }
            poj1852(L, ants, c);
        }
        for (int i = 0; i < cases; ++i) {
            System.out.println(minTime[i] + " " + maxTime[i]);
        }
    }
    public void poj1852(int L, int[] ants, int caseNum) {
        minTime[caseNum] = Integer.MIN_VALUE;
        for (int i = 0; i < ants.length; ++i) {
            int t = Math.min(ants[i], L - ants[i]);
            if (t > minTime[caseNum]) minTime[caseNum] = t;
        }
        maxTime[caseNum] = Integer.MIN_VALUE;
        for (int i = 0; i < ants.length; ++i) {
            int t = Math.max(ants[i], L - ants[i]);
            if (t > maxTime[caseNum]) maxTime[caseNum] = t;
        }
    }

}
