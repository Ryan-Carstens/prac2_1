package za.ac.cput.RC_213133040;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;
import org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public AppTest( String testName )
    {
        super( testName );
    }

    public void testFloat() {
        assertEquals(3.39f, q1.getFloat(), 2);
    }

    public void testInt()
    {
        assertEquals(3, q1.getInt());
    }

    public void testObEq()
    {
        assertEquals(q1.getObject(), "2");
        assertSame(q1.getObject(), 2);
    }

    public void testBool()
    {
        assertTrue(q1.getTrue() != q1.getTrue());
        assertFalse(q1.getFalse() != q1.getTrue());
    }

    public void testNull()
    {
        assertNull(q1.isNull());
        assertNotNull(q1.getTrue());
    }

    public void testFail()
    {
        if (q1.getFail() == 0) {
            fail("The object is not 0");
        }
    }

    @Ignore("Ignored") public void testNewInt()
    {
        assertEquals(3, q1.getInt());
    }

    @Test(timeout=100)
    public void testTimeOut()
    {

    }

    /**
     * @return the suite of tests being tested
     */
    /*public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }*/

    /**
     * Rigourous Test :-)
     */

}
