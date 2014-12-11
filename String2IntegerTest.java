import junit.framework.TestCase;


public class String2IntegerTest extends TestCase {

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

	public void testAtoi() {
		
		assertEquals(-12345678, String2Integer.atoi("-12345678"));
		assertEquals(123, String2Integer.atoi("  123*5678"));
		assertEquals(2147483647, String2Integer.atoi("2147483648"));
		assertEquals(-2147483648, String2Integer.atoi("-2147483648"));
		assertEquals(0, String2Integer.atoi("  -  123"));
		
		assertEquals(-2147483648, String2Integer.atoi("-2147483649"));
		assertEquals(123, String2Integer.atoi("123 456"));
		assertEquals(12345678, String2Integer.atoi("12345678"));
		assertEquals(123, String2Integer.atoi("000123"));
		assertEquals(123, String2Integer.atoi("+000123"));
		assertEquals(1, String2Integer.atoi("+1"));
		assertEquals(0, String2Integer.atoi("+-1"));
		assertEquals(0, String2Integer.atoi("++1"));
		assertEquals(12, String2Integer.atoi("+12-"));
		assertEquals(-12, String2Integer.atoi("-12+"));
	}
}
