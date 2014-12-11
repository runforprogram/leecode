import junit.framework.TestCase;


public class PalindromeNumberTest extends TestCase {

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

	public void testIsPalindrome() {
		assertEquals(true, new PalindromeNumber().isPalindrome(0));
		assertEquals(true, new PalindromeNumber().isPalindrome(1221));
		assertEquals(false, new PalindromeNumber().isPalindrome(123456));
		assertEquals(false, new PalindromeNumber().isPalindrome(-1221));
		assertEquals(false, new PalindromeNumber().isPalindrome(Integer.MAX_VALUE));
	}

}
