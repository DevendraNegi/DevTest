package org.dev.test.firsttime.steps;

import org.dev.test.firsttime.DevTest.SFALoginPage;
import net.thucydides.core.annotations.Step;

public class SFALoginPageSteps {

	SFALoginPage mpage;

	@Step
	public void getUrl() {
		mpage.openAt("https://www.gmail.com/");
		mpage.getDriver().manage().window().maximize();
	}

	@Step
	public void fillCredentials(String email, String password) {
		mpage.login(email, password);
	}
}
