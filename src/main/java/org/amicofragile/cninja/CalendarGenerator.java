package org.amicofragile.cninja;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CalendarGenerator {
	private final String[] competitors;

	public CalendarGenerator(String... competitors) {
		checkCompetitorsListIsNotEmpty(competitors);
		checkCompetitorsListDoesntContainRepetitions(competitors);
		this.competitors = normalize(competitors);
	}

	private String[] normalize(String[] competitors) {
		String[] result = competitors;
		if (competitors.length % 2 == 1) {
			result = Arrays.copyOf(competitors, competitors.length + 1);
			result[competitors.length] = "-";
		}
		return result;
	}

	private void checkCompetitorsListIsNotEmpty(String[] competitors) {
		if (competitors.length == 0) {
			throw new IllegalArgumentException("Can't instantiate CalendarGenerator without competitors");
		}
	}

	private void checkCompetitorsListDoesntContainRepetitions(String[] competitors) {
		Set<String> temp = new HashSet<String>();
		for (String t : competitors) {
			temp.add(t);
		}
		if (temp.size() < competitors.length) {
			throw new IllegalArgumentException("Can't supply the same competitor twice");
		}
	}

	public List<Day> generate() {
		List<Day> calendar = new LinkedList<Day>();
		if (competitors.length == 2) {
			Day day1 = new Day();
			day1.addMatch(new Match(competitors[0], competitors[1]));
			calendar.add(day1);
		} else if (competitors.length == 4) {
			Day day1 = new Day();
			day1.addMatch(new Match(competitors[0], competitors[1]));
			day1.addMatch(new Match(competitors[2], competitors[3]));
			calendar.add(day1);
			Day day2 = new Day();
			day2.addMatch(new Match(competitors[0], competitors[2]));
			day2.addMatch(new Match(competitors[1], competitors[3]));
			calendar.add(day2);
			Day day3 = new Day();
			day3.addMatch(new Match(competitors[0], competitors[3]));
			day3.addMatch(new Match(competitors[1], competitors[2]));
			calendar.add(day2);
		} else if (competitors.length == 6) {
			Day day1 = new Day();
			day1.addMatch(new Match(competitors[0], competitors[1]));
			day1.addMatch(new Match(competitors[2], competitors[3]));
			day1.addMatch(new Match(competitors[4], competitors[5]));
			calendar.add(day1);
			Day day2 = new Day();
			day2.addMatch(new Match(competitors[0], competitors[3]));
			day2.addMatch(new Match(competitors[4], competitors[1]));
			day2.addMatch(new Match(competitors[2], competitors[5]));
			calendar.add(day2);
			Day day3 = new Day();
			day3.addMatch(new Match(competitors[0], competitors[4]));
			day3.addMatch(new Match(competitors[2], competitors[1]));
			day3.addMatch(new Match(competitors[5], competitors[3]));
			calendar.add(day3);
			Day day4 = new Day();
			day4.addMatch(new Match(competitors[0], competitors[2]));
			day4.addMatch(new Match(competitors[3], competitors[4]));
			day4.addMatch(new Match(competitors[1], competitors[5]));
			calendar.add(day4);
			Day day5 = new Day();
			day5.addMatch(new Match(competitors[0], competitors[2]));
			day5.addMatch(new Match(competitors[3], competitors[4]));
			day5.addMatch(new Match(competitors[5], competitors[1]));
			calendar.add(day5);
		}
		return calendar;
	}
}
