package com.t3.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.t3.qa.pages.FlightPurchaseConfMessagePage;
import com.t3.qa.pages.FlightPurchasePage;
import com.t3.qa.utils.ConstantsT3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightPurchaseSteps {
	FlightPurchaseConfMessagePage message;
	FlightPurchasePage pas;

	@Given("User navigates to Purchase Page {string}")
	public void userNavigatesToPurchasePage(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ConstantsT3.driver = new ChromeDriver();
		Thread.sleep(1000);
		ConstantsT3.driver.manage().window().maximize();
		ConstantsT3.driver.get(url);
		Thread.sleep(2000);
		ConstantsT3.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pas = new FlightPurchasePage();
	}

	@When("User enters Full Name {string}")
	public void userEntersFullName(String fullName) {
		pas.enterName(fullName);
	}

	@When("User enters Address {string}")
	public void userEntersAddress(String address) {
		pas.enterAddress(address);
	}

	@When("User enters City {string}")
	public void userEntersCity(String city) {
		pas.enterCity(city);
	}

	@When("User enters State {string}")
	public void userEntersState(String state) {
		pas.enterState(state);
	}

	@When("User enters Zipcode {string}")
	public void userEntersZipcode(String zip) {
		pas.enterZip(zip);
	}

	@When("User selects Card Type {string}")
	public void userSelectsCardType(String cardTypelist) {
		pas.selectCardType(cardTypelist);
	}

	@When("User enters Card Number {string}")
	public void userEntersCardNumber(String cardNumber) {
		pas.entercardNumber(cardNumber);
		;
	}

	@When("User enters Card month {string}")
	public void userEntersCardMonth(String month) {
		pas.enterMonth(month);
	}

	@When("User enters Card Year {string}")
	public void userEntersCardYear(String year) {
		pas.enterYear(year);
	}

	@When("User enters Name on the Card {string}")
	public void userEntersNameOnTheCard(String nameOnTheCard) {
		pas.enterNameOnTheCard(nameOnTheCard);
	}

	@When("User clicks on Remember Me button")
	public void userClicksOnRememberMeButton() {
		pas.clickRememberMe();
	}

	@When("User clicks on Purchase Flight button")
	public void userClicksOnPurchaseFlightButton() {
		pas.clickPurchese();
	}

	@Then("User verifies success message {string}")
	public void userVerifiesSuccessMessage(String expMessage) throws InterruptedException {
		message = new FlightPurchaseConfMessagePage();
		message.verifyMessage(expMessage);
		Thread.sleep(2000);
		ConstantsT3.driver.quit();
	}

}
