

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestTheStatistics.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTheStatistics
{
    /**
     * Default constructor for test class TestTheStatistics
     */
    public TestTheStatistics()
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
    public void testGetAverage()
    {
        Monitoring monitori1 = new Monitoring();
        monitori1.addObs(1, "Newcastle", "UK", 1999, 34000);
        monitori1.addEarthquakeToObs(1, 4.5, 34.66, 22.98, 1993);
        monitori1.addEarthquakeToObs(1, 5.6, 34.88, 67.44, 1996);
        monitori1.getAvgLargestMag();
    }

    @Test
    public void testGetLargestMagnitude()
    {
        Monitoring monitori1 = new Monitoring();
        monitori1.addObs(2, "Newcastle", "UK", 1999, 69999);
        monitori1.addEarthquakeToObs(2, 4.3, 45.77, 33.67, 1999);
        monitori1.addEarthquakeToObs(2, 7.6, 22.33, 55.18, 2004);
        monitori1.getLargestEverMag();
    }

    @Test
    public void getListlargerThanNum()
    {
        Observatory observat1 = new Observatory(11, "Newcastle", "UK", 1990, 3400);
        observat1.addEarthquake(5.4, 45.33, 23.67, 1994);
        observat1.addEarthquake(3.4, 38.29, 23.66, 1997);
        observat1.getListOfEventsLargerThanx(4);
    }
}



