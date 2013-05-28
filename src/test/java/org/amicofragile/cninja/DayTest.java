package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayTest {
	@Test
	public void givenADayWithoutMatchesThenContainsReturnsFalse() throws Exception {
		Day day = new Day();
		assertFalse(day.contains(new Match("A", "B")));
	}
	
	@Test
	public void givenADayWithAMatchThenContainsReturnsTrueForThatMatch() throws Exception {
		Match match = new Match("A", "B");
		Day day = new Day();
		day.addMatch(match);
		assertTrue(day.contains(match));
	}
}
