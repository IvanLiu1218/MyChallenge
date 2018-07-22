package lab.ivanliu.poj;

import java.util.Scanner;

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

}
