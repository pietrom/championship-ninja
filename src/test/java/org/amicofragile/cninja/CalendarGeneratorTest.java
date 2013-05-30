package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalendarGeneratorTest {
	@Test(expected=IllegalArgumentException.class)
	public void cantCreateGeneratorWithoutTeams() throws Exception {
		new CalendarGenerator();
	}
}
