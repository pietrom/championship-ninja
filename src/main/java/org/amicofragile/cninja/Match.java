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
	
	@Override
	public boolean equals(Object obj) {
		Match that = (Match)obj;
		return this.home.equals(that.home) && this.guest.equals(that.guest);
	}
}
