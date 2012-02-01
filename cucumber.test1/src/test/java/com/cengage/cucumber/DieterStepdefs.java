package com.cengage.cucumber;

import cucumber.annotation.en.*;
import cucumber.annotation.*;

import static junit.framework.Assert.*;

public class DieterStepdefs {
	private Fridge fridge;
	private Dieter dieter;
	private boolean tooFull;

	@Before
	public void iAmADieter() {
		dieter = new Dieter();
		tooFull = false;
	}

	@Given("^I have (\\d+) cucumbers$")
	public void iHaveNCucumbers(int n) {
		fridge = new Fridge(n);
		dieter.setFridge(fridge);
	}

	@When("^I (?:try to )?eat (\\d+) cucumbers$")
	public void iEatNCucumbers(int n) {
		try {
			dieter.eatCucumbers(n);
		} catch (TooFullException e) {
			tooFull = true;
		}
	}

	@Then("^I should have (\\d+) cucumbers$")
	public void iShouldHaveNCucumbers(int n) {
		assertEquals(n, fridge.getCucumbers());
	}

	@Then("^I should want (\\d+) cucumbers?$")
	public void iShouldWantNCucumbers(int n) {
		assertEquals(n, dieter.getCucumbersWanted());
	}

	@Then("^I should not want more cucumbers$")
	public void iShouldNotWantMoreCucumbers() {
		assertEquals(0, dieter.getCucumbersWanted());
	}

	@Then("^I should ((?:not )?)feel uncomfortably full$")
	public void iShouldOrShouldNotFeelUncomfortablyFull(String shouldNot) {
		assertEquals(shouldNot.isEmpty(), tooFull);
	}
}
