package org.dev.test.firsttime.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SFAHomePage extends PageObject {

	@FindBy(xpath = "//div[text()='Primary']")
	public WebElementFacade lbl_primary;

	@FindBy(xpath = "	//div[text()='COMPOSE']")
	public WebElementFacade btn_compose;

	@FindBy(xpath = "(//span[contains(.,'To')]/../../..//textarea)[1]")
	public WebElementFacade tbx_to;

	@FindBy(xpath = "//input[@name='subjectbox']")
	public WebElementFacade tbx_subject;

	@FindBy(xpath = "//div[text()='Send']")
	public WebElementFacade btn_send;

	@FindBy(xpath = "//a[text()='Sent Mail']")
	public WebElementFacade btn_sent_email;

	public boolean validate() {
		if (lbl_primary.getText().equalsIgnoreCase("Primary")) {
			return true;
		} else {
			return false;
		}
	}

	public void composeMail() {
		btn_compose.click();
		waitABit(1000);
		tbx_to.type("");
		tbx_subject.type("");
		btn_send.click();

	}

	boolean sentItems() {
		btn_sent_email.click();
		
		return false;

	}

}
