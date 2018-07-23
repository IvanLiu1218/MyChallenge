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

    @Test
    public void testPojXXXX1() {
        String[] input = {
            "#S######.#",
            "......#..#",
            ".#.##.##.#",
            ".#........",
            "##.##.####",
            "....#....#",
            ".#######.#",
            "....#.....",
            ".####.###.",
            "....#...G#"
        };
        char[][] maze = new char[10][10];
        for (int i = 0; i < maze.length; ++i) {
            maze[i] = input[i].toCharArray();
        }
        assertEquals(22, solution.pojXXX1(maze, 0, 1, 9, 8));
    }

    @Test
    public void testPoj3617() {
        assertEquals("ABCBCD", solution.poj3617("ACDBCB"));
    }

    @Test
    public void testPoj3069() {
        assertEquals(1, solution.poj3069(new int[]{0}, 10));
        assertEquals(3, solution.poj3069(new int[]{1,7,15,20,30,50}, 10));
        assertEquals(2, solution.poj3069(new int[]{1,50}, 10));

        assertEquals(2, solution.poj3069(new int[]{10,20,20}, 0));
        assertEquals(4, solution.poj3069(new int[]{70,30,1,7,15,20,50}, 10));
    }
}