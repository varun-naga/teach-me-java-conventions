import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class powertest {
    private static final double epsilon = 1e-15;
    @Test
    public void testOnePowerOneIsOne() {

        Power power = new Power();
        assertEquals(1, power.OF(1, 1), epsilon);
    }
    @Test
    public void testTwoPowerOneIsTwo() {

        Power power = new Power();
        assertEquals(2, power.OF(2, 1), epsilon);
    }
    @Test
    public void testTwoPowerTwoIsFour() {

        Power power = new Power();
        assertEquals(4, power.OF(2, 2), epsilon);
    }
    @Test
    public void testThreePowerTwoISNine() {

        Power power = new Power();
        assertEquals(9, power.OF(3, 2), epsilon);
    }
}
