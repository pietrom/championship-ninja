package org.amicofragile.cninja;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CalendarGenerator {
	private final String[] competitors;

	public CalendarGenerator(String... competitors) {
		checkCompetitorsListIsNotEmpty(competitors);
		Set<String> temp = new HashSet<String>();
		for (String t : competitors) {
			temp.add(t);
		}
		if (temp.size() < competitors.length) {
			throw new IllegalArgumentException("Can't supply the same competitor twice");
		}
		this.competitors = competitors;
	}

	private void checkCompetitorsListIsNotEmpty(String[] competitors) {
		if (competitors.length == 0) {
			throw new IllegalArgumentException("Can't instantiate CalendarGenerator without competitors");
		}
	}

	public List<Day> generate() {
		List<Day> calendar = new LinkedList<Day>();
		Day day1 = new Day();
		day1.addMatch(new Match(competitors[0], competitors[1]));
		calendar.add(day1);
		return calendar;
	}
}
