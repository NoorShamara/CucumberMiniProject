package com.t3.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.t3.qa.utils.ConstantsT3;

public class FlightPurchasePage {
	@FindBy(xpath = "//input[@id='inputName']")
	WebElement nameField;
	@FindBy(xpath = "//input[@id='address']")
	WebElement addressField;
	@FindBy(xpath = "//input[@id='city']")
	WebElement cityField;
	@FindBy(xpath = "//input[@id='state']")
	WebElement stateField;
	@FindBy(xpath = "//input[@id='zipCode']")
	WebElement zipField;
	@FindBy(xpath = "//select[@id='cardType']")
	WebElement cardTypelist;
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement cardnumberField;
	@FindBy(xpath = "//input[@id='creditCardMonth']")
	WebElement monthField;
	@FindBy(xpath = "//input[@id='creditCardYear']")
	WebElement yearField;
	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement nameOnCardField;
	@FindBy(xpath = "//input[@id='rememberMe']")
	WebElement remebermeCheakBox;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement purchaseButton;

	public FlightPurchasePage() {
		PageFactory.initElements(ConstantsT3.driver, this);
	}

	public void enterName(String fullName) {
		nameField.sendKeys(fullName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZip(String zip) {
		zipField.sendKeys(zip);
	}

	public void selectCardType(String cardType) {
		Select select = new Select(cardTypelist);
		select.selectByVisibleText(cardType);
		;

	}

	public void entercardNumber(String cardNumber) {
		cardnumberField.sendKeys(cardNumber);
	}

	public void enterMonth(String month) {
		monthField.sendKeys(month);
	}

	public void enterYear(String year) {
		yearField.sendKeys(year);
	}

	public void enterNameOnTheCard(String nameOnTheCard) {
		nameOnCardField.sendKeys(nameOnTheCard);
	}

	public void clickRememberMe() {
		remebermeCheakBox.click();
	}

	public void clickPurchese() {
		purchaseButton.click();
	}
}
