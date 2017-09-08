package org.dev.test.firsttime.DevTest;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SFAHomePage extends PageObject {

	@FindBy(xpath = "//div[text()='Primary']")
	WebElementFacade lbl_primary;

	public boolean validate() {
		if (lbl_primary.getText().equalsIgnoreCase("Primary")) {
			return true;
		} else {
			return false;
		}
	}
}
