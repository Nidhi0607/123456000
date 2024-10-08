package com.qsp.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//initialization
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Register")
	private WebElement Registerlink;
	
	@FindBy(xpath = "//span[text() = 'Shopping cart']")
	private WebElement shoppingCartLink;

	//provide getter
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	

	
	

}
