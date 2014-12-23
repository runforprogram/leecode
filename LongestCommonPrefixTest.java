import junit.framework.TestCase;

public class LongestCommonPrefixTest extends TestCase {

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

	public void testLongestCommonPrefix() {
		String[] strs = { "abc", "abcefg", "abcefgi" };
		assertEquals("abc", new LongestCommonPrefix().longestCommonPrefix0(strs));
		String[] strs1 = { "", "abcefg", "abcefgi" };
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix0(strs1));
		String[] strs2 = { "abc", "", "abcefgi" };
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix0(strs2));
	}
}
