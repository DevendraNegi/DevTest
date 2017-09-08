package org.dev.test.firsttime.DevTest;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SFALoginPage extends PageObject {

	@FindBy(xpath = "//input[@type='email']")
	WebElementFacade tbx_email;

	@FindBy(xpath = "//input[@type='password']")
	WebElementFacade tbx_password;

	@FindBy(xpath = "//span[text()='Next']")
	WebElementFacade btn_next;

	public void login(String email, String password) {
		tbx_email.type(email);
		btn_next.click();
		waitABit(1000);
		tbx_password.type(password);
		btn_next.click();

	}
}
