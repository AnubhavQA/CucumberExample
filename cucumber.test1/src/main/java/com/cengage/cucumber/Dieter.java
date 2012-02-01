package com.cengage.cucumber;

public class Dieter {
	private static final int TOO_FULL_THRESHOLD = 10;

	private Fridge fridge;
	private int cucumbersWanted;

	public int getCucumbersWanted() {
		return cucumbersWanted;
	}

	public void eatCucumbers(int n) throws TooFullException {
		cucumbersWanted = n;
		int cucumbersEaten = fridge.removeCucumbers(Math.min(n, TOO_FULL_THRESHOLD));
		if (cucumbersEaten >= TOO_FULL_THRESHOLD) {
			cucumbersWanted = 0;
			throw new TooFullException();
		}
		cucumbersWanted -= cucumbersEaten;
	}

	public void setFridge(Fridge fridge) {
		this.fridge = fridge;
	}
}
