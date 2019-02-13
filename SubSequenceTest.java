import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class SubSequenceTest {

	@Test
	void test() {
		String s1 = "ABAZDC";
		String s2 = "BACBAD";
		String expected = "ABAD";
		SubSequence sq = new SubSequence();
		String actual = sq.SubSequence(s1, s2);
		assertTrue("Given the input "+s1+" and "+s2+" I expected, " +expected+" but instead got " +actual ,expected.equals(actual));
		//expected == actual fails test

	}
	@Test
	void test2() {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		String expected = "GTAB";
		SubSequence sq = new SubSequence();
		String actual = sq.SubSequence(s1, s2);
		assertTrue("Given the input "+s1+" and "+s2+" I expected, " +expected+" but instead got " +actual ,expected.equals(actual));
		//expected == actual fails test

	}
	@Test
	void test3() {
		String s1 = "aaaa";
		String s2 = "aa";
		String expected = "aa";
		SubSequence sq = new SubSequence();
		String actual = sq.SubSequence(s1, s2);
		assertTrue("Given the input "+s1+" and "+s2+" I expected, " +expected+" but instead got " +actual , expected.equals(actual));
		//expected == actual fails test
}
	@Test
	void test4() {
	String s1 = "";
	String s2 = "";
	String expected = "";
	SubSequence sq = new SubSequence();
	String actual = sq.SubSequence(s1, s2);
	assertTrue("Given the input "+s1+" and "+s2+" I expected, " +expected+" but instead got " +actual ,expected == actual);
	
}
	@Test
	void test5() {
		String s1="ok";
		String s2="ok";
		String expected = "ok";
		SubSequence sq = new SubSequence();
		String actual = sq.SubSequence(s1, s2);
		assertTrue("Given the input "+s1+" and "+s2+" I expected, " +expected+" but instead got " +actual ,expected == actual);
	}
}