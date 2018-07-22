package lab.ivanliu.poj;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testPoj1000() {
        assertEquals(3, solution.poj1000(1, 2));
    }
}