

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestTheGets.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTheGets
{
    /**
     * Default constructor for test class TestTheGets
     */
    public TestTheGets()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testEarthquake()
    {
        Earthquake earthqua1 = new Earthquake(5.4, 56.43, 43.78, 1999);
        assertEquals(5.4, earthqua1.getMagnitude(), 0.1);
    }

    @Test
    public void TestObservatory()
    {
        Observatory observat1 = new Observatory(1, "Newcastle", "UK", 1994, 3900);
        observat1.addEarthquake(5.4, 34.55, 23.44, 2000);
        observat1.addEarthquake(3.5, 67.43, 34.66, 2001);
        observat1.printEarthEvents();
    }
}


