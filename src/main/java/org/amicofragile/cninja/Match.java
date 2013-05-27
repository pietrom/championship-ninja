package org.amicofragile.cninja;

public class Match {
	private final String home, guest;

	public Match(String home, String guest) {
		checkArgumentIsNotNull(home, "Home competitor can't be null");
		checkArgumentIsNotNull(guest, "Guest competitor can't be null");

		this.home = home;
		this.guest = guest;
	}

	private void checkArgumentIsNotNull(Object arg, String message) {
		if (arg == null) {
			throw new IllegalArgumentException(message);
		}
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

	public boolean isReverseOf(Match that) {
		return this.guest.equals(that.home) && this.home.equals(that.guest);
	}
}
