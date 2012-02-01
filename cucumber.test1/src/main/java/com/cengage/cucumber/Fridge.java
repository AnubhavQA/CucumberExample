package com.cengage.cucumber;

public class Fridge {
	private int cucumbers;

	public Fridge(int n) {
		cucumbers = n;
	}

	public int getCucumbers() {
		return cucumbers;
	}

	public int removeCucumbers(int n) {
		int m = Math.min(n, cucumbers);
		cucumbers -= m;
		return m;
	}
}
