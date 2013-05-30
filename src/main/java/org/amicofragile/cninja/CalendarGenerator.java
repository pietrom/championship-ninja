package org.amicofragile.cninja;

import java.util.LinkedList;
import java.util.List;

public class CalendarGenerator {
	private final String[] competitors;

	public CalendarGenerator(String... competitors) {
		if (competitors.length == 0) {
			throw new IllegalArgumentException("Can't instantiate CalendarGenerator without competitors");
		}
		this.competitors = competitors;
	}

	public List<Day> generate() {
		List<Day> calendar = new LinkedList<Day>();
		Day day1 = new Day();
		day1.addMatch(new Match(competitors[0], competitors[1]));
		calendar.add(day1);
		return calendar;
	}
}
