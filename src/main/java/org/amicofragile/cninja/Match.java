package org.amicofragile.cninja;

public class Match {
	private final String home, guest;

	public Match(String home, String guest) {
		if (home == null) {
			throw new IllegalArgumentException("Home competitor can't be null");
		}
		if (guest == null) {
			throw new IllegalArgumentException("Guest competitor can't be null");
		}
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
		Match that = (Match) obj;
		return this.home.equals(that.home) && this.guest.equals(that.guest);
	}

	@Override
	public int hashCode() {
		return (11 + this.home.hashCode()) * 17 + this.guest.hashCode();
	}
}
