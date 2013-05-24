package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {
	private static final String GUEST = "B";
	private static final String HOME = "A";
	private static final String OTHER = "O";

	@Test
	public void testConstructorAndGetters() throws Exception {
		Match match = new Match(HOME, GUEST);
		assertEquals(HOME, match.getHome());
		assertEquals(GUEST, match.getGuest());
	}
	
	@Test
	public void matchesAreEqualsIfBothCompetitorsAreEquals() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(HOME, GUEST);
		assertEquals(m1, m2);
	}
	
	@Test
	public void matchesAreNotEqualsIfMatchesHaveDifferentHomeCompetitors() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(OTHER, GUEST);
		assertNotEquals(m1, m2);
	}
	
	@Test
	public void matchesAreNotEqualsIfMatchesHaveDifferentGuestCompetitors() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(HOME, OTHER);
		assertNotEquals(m1, m2);
	}
	
	@Test
	public void orderMattersInEquals() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(GUEST, HOME);
		assertNotEquals(m1, m2);
	}
	
	@Test
	public void equalsMatchesHaveTheSameHashCode() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(HOME, GUEST);
		assertEquals(m1.hashCode(), m2.hashCode());
	}
	
	@Test
	public void notEqualsMatchesHaveDifferentHashCodes() throws Exception {
		Match m1 = new Match(HOME, GUEST);
		Match m2 = new Match(HOME, OTHER);
		assertNotEquals(m1.hashCode(), m2.hashCode());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void cantProvideNullHomeCompetitor() throws Exception {
		new Match(null, GUEST);
	}
}
