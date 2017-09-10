package org.dev.test.firsttime.DevTest;

import org.dev.test.firsttime.page.SFAHomePage;
import org.junit.Assert;

import cucumber.api.java.en.Then;

public class HomeDefinition {
	SFAHomePage sfaHomePage;

	@Then("^It should navigate me to the facebook home page$")
	public void it_should_navigate_me_to_the_facebook_home_page() throws Throwable {
		sfaHomePage.waitFor(sfaHomePage.lbl_primary);
		Assert.assertTrue("home page", sfaHomePage.validate());
	}
}
