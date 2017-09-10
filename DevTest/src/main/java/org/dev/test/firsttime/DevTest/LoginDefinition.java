package org.dev.test.firsttime.DevTest;

import org.dev.test.firsttime.page.SFAHomePage;
import org.dev.test.firsttime.steps.SFALoginPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinition {
	@Steps
	SFALoginPageSteps mypagesteps;
	SFAHomePage sfaHomePage;

	@Given("^I am in facbook login page$")
	public void i_am_in_facbook_login_page() throws Throwable {
		System.out.println("Test Given Start");
		mypagesteps.getUrl();

		System.out.println("Test Given End");

	}

	@When("^I fill the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_fill_the_username_as_and_password_as(String email, String password) throws Throwable {
		mypagesteps.fillCredentials(email, password);
	}

	

}
