package com.richman.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.richman.base.BaseClass;

public class ElementPage extends BaseClass{
	
	public ElementPage(){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/header/div/div[3]/div/div[1]/ul/li/a[2]")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath= "/html/body/div[2]/div[1]/header/div/div[3]/div/div[1]/ul/li/div/form/input[3]")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	@FindBy(xpath= "/html/body/div[2]/div[1]/header/div/div[3]/div/div[1]/ul/li/div/form/input[4]")
	private WebElement password;

	public WebElement getPassword() {
		return password;
}
	@FindBy(xpath= "/html/body/div[2]/div[1]/header/div/div[3]/div/div[1]/ul/li/div/form/div[1]/input")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
}
