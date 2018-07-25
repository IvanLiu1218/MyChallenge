package lab.ivanliu.poj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** Java 1.5 */
public class Main {

    private static Main solution = new Main();

    public static void main(String[] args) throws Exception {
        solution.poj3617();
    }

    public void poj3617() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            sb.append(cin.next().charAt(0));
        }
        String result = poj3617(sb.toString());
        int len = result.length();
        int i = 0;
        while (len > 80) {
            System.out.println(result.substring(i, i + 80));
            len -= 80;
            i += 80;
        }
        System.out.println(result.substring(i, result.length()));
    }
    public String poj3617(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; --i) {
            sb.append(s.charAt(i));
        }
        String s2 = sb.toString();
        sb = new StringBuilder();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) < s.charAt(j)) {
                sb.append(s.charAt(i));
                ++i;
            } else if (s.charAt(i) > s.charAt(j)) {
                sb.append(s.charAt(j));
                --j;
            } else /* s[i] == s[j] */ {
                int x = s.length() - j - 1;
                int y = s.length() - i - 1;
                String ss1 = s.substring(i, j + 1);
                String ss2 = s2.substring(x, y + 1);
                if (ss1.compareTo(ss2) <= 0) {
                    sb.append(s.charAt(i));
                    ++i;
                } else /* ss1 > ss2 */ {
                    sb.append(s.charAt(j));
                    --j;
                }
            }
        }
        return sb.toString();
    }
}
