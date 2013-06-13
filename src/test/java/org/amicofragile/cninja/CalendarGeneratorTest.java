package org.amicofragile.cninja;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CalendarGeneratorTest {
	@Test(expected = IllegalArgumentException.class)
	public void cantCreateGeneratorWithoutTeams() throws Exception {
		new CalendarGenerator();
	}

	@Test
	public void givenGeneratorWithTwoTeamsThenGenerateASingleDayCalendar()
			throws Exception {
		CalendarGenerator generator = new CalendarGenerator("A", "B");
		List<Day> calendar = generator.generate();
		assertEquals(1, calendar.size());
		assertEquals(1, calendar.get(0).getMatchCount());
		assertTrue(calendar.get(0).containsMatch(new Match("A", "B")));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void cantSupplyTheSameCompetitorTwiceToTheGenerator() throws Exception {
		new CalendarGenerator("A", "A");
	}
	
	@Test
	public void threeDayForFourTeams() throws Exception {
		CalendarGenerator generator = new CalendarGenerator("A", "B", "C", "D");
		List<Day> calendar = generator.generate();
		assertEquals(3, calendar.size());
		assertEquals(2, calendar.get(0).getMatchCount());
		assertEquals(2, calendar.get(1).getMatchCount());
		assertEquals(2, calendar.get(2).getMatchCount());
	}
	
	@Test
	public void threeDayForThreeTeams() throws Exception {
		CalendarGenerator generator = new CalendarGenerator("A", "B", "C");
		List<Day> calendar = generator.generate();
		assertEquals(3, calendar.size());
		assertEquals(2, calendar.get(0).getMatchCount());
		assertEquals(2, calendar.get(1).getMatchCount());
		assertEquals(2, calendar.get(2).getMatchCount());
	}
	
	@Test
	public void fiveDaysForSixTeams() throws Exception {
		CalendarGenerator generator = new CalendarGenerator("A", "B", "C", "D", "E", "F");
		List<Day> calendar = generator.generate();
		assertEquals(5, calendar.size());
		assertEquals(3, calendar.get(0).getMatchCount());
		assertEquals(3, calendar.get(1).getMatchCount());
		assertEquals(3, calendar.get(2).getMatchCount());
		assertEquals(3, calendar.get(3).getMatchCount());
		assertEquals(3, calendar.get(4).getMatchCount());
	}
}
