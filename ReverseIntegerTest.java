import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import junit.framework.TestCase;


public class ReverseIntegerTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testReverse() {
        assertEquals("测试", ReverseInteger.reverse(12345), 54321);
        assertEquals("测试", ReverseInteger.reverse(-12345), -54321);
        assertEquals("测试", ReverseInteger.reverse(1147483647), 0);
        assertEquals("测试", ReverseInteger.reverse(-1147483647), 0);
        assertEquals("测试", ReverseInteger.reverse(1000), 1);
        assertEquals("测试", ReverseInteger.reverse(10010), 1001);
      //  assertEquals("测试", ReverseInteger.reverse(1000), 1);
        
       // 2147483647;
	}

}
