package lab.ivanliu.poj;

import java.util.Scanner;

/** Java 1.5 */
public class Main {

    private static Main myMain = new Main();

    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = myMain.poj1000(a, b);
        System.out.println(c);
    }

    public int poj1000(int a, int b) {
        return a + b;
    }

}
