package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hello extends BaseClass {
	@Before
	// pre
	public void precondition() {
		launchbrowser();
		windowmaximize();

	}

	@After
//post
	public void postcondition() {
		closebrowser();
	}
}
