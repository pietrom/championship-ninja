package org.amicofragile.cninja;

public class Match {
	private final String home, guest;
	
	public Match(String home, String guest) {
		this.home = home;
		this.guest = guest;
	}

	public String getHome() {
		return home;
	}

	public String getGuest() {
		return guest;
	}
}
