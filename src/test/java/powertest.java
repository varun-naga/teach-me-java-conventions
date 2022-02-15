import org.junit.Test;
import powerpackage.powerfinder;

import static org.junit.Assert.assertEquals;

public class powertest {
    private static final double epsilon = 1e-15;
    @Test
    public void testOnePowerOneIsOne() {

        powerfinder power = new powerfinder();
        assertEquals(1, power.OF(1, 1), epsilon);
    }
    @Test
    public void testTwoPowerOneIsTwo() {

        powerfinder power = new powerfinder();
        assertEquals(2, power.OF(2, 1), epsilon);
    }
    @Test
    public void testTwoPowerTwoIsFour() {

        powerfinder power = new powerfinder();
        assertEquals(4, power.OF(2, 2), epsilon);
    }
    @Test
    public void testThreePowerTwoISNine() {

        powerfinder power = new powerfinder();
        assertEquals(9, power.OF(3, 2), epsilon);
    }
}
