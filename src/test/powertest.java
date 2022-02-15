import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class powertest {
    private static final double epsilon = 1e-15;
    @Test
    public void testOnePowerOneIsOne() {

        Power power = new Power();
        assertEquals(1, power.powerFinder(1, 1), epsilon);
    }
    @Test
    public void testTwoPowerOneIsTwo() {

        Power power = new Power();
        assertEquals(2, power.powerFinder(2, 1), epsilon);
    }
    @Test
    public void testTwoPowerTwoIsFour() {

        Power power = new Power();
        assertEquals(4, power.powerFinder(2, 2), epsilon);
    }
    @Test
    public void testThreePowerTwoISNine() {

        Power power = new Power();
        assertEquals(9, power.powerFinder(3, 2), epsilon);
    }
}
