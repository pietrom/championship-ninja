package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayTest {
	@Test
	public void givenADayWithoutMatchesThenContainsReturnsFalse() throws Exception {
		Day day = new Day();
		assertFalse(day.contains(new Match("A", "B")));
	}
}
