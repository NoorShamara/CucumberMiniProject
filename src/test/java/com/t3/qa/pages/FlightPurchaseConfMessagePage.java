package com.t3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.t3.qa.utils.ConstantsT3;

public class FlightPurchaseConfMessagePage {
	
	@FindBy (xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement confirmationMessage;

	
	public FlightPurchaseConfMessagePage() {
		PageFactory.initElements(ConstantsT3.driver, this);
	}
	
	public void verifyMessage(String expMessage) {
		
		String actualMessage = confirmationMessage.getText();
		if (actualMessage.equals(expMessage)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAILED");
		}
		
		
	}
}