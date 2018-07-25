package lab.ivanliu.poj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** Java 1.5 */
public class Main {

    private static Main solution = new Main();

    public static void main(String[] args) throws Exception {
        solution.poj3069();
    }

    public void poj3069() {
        Scanner cin = new Scanner(System.in);
        int R = cin.nextInt();
        int N = cin.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        while (N != -1 && R != -1) {
            int[] points = new int[N];
            for (int i = 0; i < N; ++i) {
                points[i] = cin.nextInt();
            }
            result.add(poj3069(points, R));
            R = cin.nextInt();
            N = cin.nextInt();
        }
        for (int i = 0; i < result.size(); ++i) {
            System.out.println(result.get(i));
        }
    }
    public int poj3069(int[] points, int R) {
        Arrays.sort(points);
        int num = 0;
        int i = 0;
        while (i < points.length) {
            int d = points[i] + R;
            while (i < points.length && points[i] <= d) ++i;
            int t = i - 1;
            ++num;
            d = points[t] + R;
            while (i < points.length && points[i] <= d) ++i;
        }
        return num;
    }
}
