package org.amicofragile.cninja;

import java.util.Collection;
import java.util.LinkedList;

public class Day {
	private final Collection<Match> matches;
	
	public Day() {
		this.matches = new LinkedList<Match>();
	}
	
	public boolean contains(Match match) {
		return matches.contains(match);
	}

	public void addMatch(Match match) {
		matches.add(match);
	}
}
