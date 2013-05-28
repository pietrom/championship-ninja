package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayTest {
	private static final Match A_MATCH = new Match("A", "B");
	private static final Match REVERSE_MATCH = new Match("B", "A");

	@Test
	public void givenADayWithoutMatchesThenContainsReturnsFalse() throws Exception {
		Day day = new Day();
		assertFalse(day.contains(A_MATCH));
	}
	
	@Test
	public void givenADayWithAMatchThenContainsReturnsTrueForThatMatch() throws Exception {
		Day day = new Day();
		day.addMatch(A_MATCH);
		assertTrue(day.contains(A_MATCH));
	}
	
	@Test
	public void givenADayWithAMatchThenContainsReturnsTrueForTheReverseMatch() throws Exception {
		Day day = new Day();
		day.addMatch(A_MATCH);
		assertTrue(day.contains(REVERSE_MATCH));
	}
}
