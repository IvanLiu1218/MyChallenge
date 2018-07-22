package lab.ivanliu.poj;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testPoj2386() {
        String[] input = {
            "W........WW.",
            ".WWW.....WWW",
            "....WW...WW.",
            ".........WW.",
            ".........W..",
            "..W......W..",
            ".W.W.....WW.",
            "W.W.W.....W.",
            ".W.W......W.",
            "..W.......W."
        };
        char[][] lake = new char[10][12];
        for (int i = 0; i < input.length; ++i) {
            lake[i] = input[i].toCharArray();
        }
        assertEquals(3, solution.poj2386(lake));
    }
}