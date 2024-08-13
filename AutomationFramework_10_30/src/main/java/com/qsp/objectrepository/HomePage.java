package com.qsp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// declaration
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	//provide gettter
	public WebElement getBookslink() {
		return bookslink;
	}



	// provide getter
	public WebElement getLogoutlink() {
		return logoutlink;
	}

}
