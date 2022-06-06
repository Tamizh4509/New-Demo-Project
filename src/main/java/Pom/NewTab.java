package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTab {
	
public static WebDriver driver;

@FindBy(xpath="//span[text()='Browser Windows']")
private WebElement window;

@FindBy(id="tabButton")
private WebElement tab;

@FindBy(xpath="//span[text()='Menu']")
private WebElement menu;

@FindBy(xpath="//a[text()='Main Item 2']")
private WebElement item1;

@FindBy(xpath="//a[text()='SUB SUB LIST »']")
private WebElement item2;

@FindBy(xpath="//a[text()='Sub Sub Item 2']")
private WebElement item3;

@FindBy(xpath="//span[text()='Select Menu']")
private WebElement selectMenu;

@FindBy(id="oldSelectMenu")
private WebElement oldselect;

public NewTab(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getWindow() {
	return window;
}

public WebElement getTab() {
	return tab;
}

public WebElement getMenu() {
	return menu;
}

public WebElement getItem1() {
	return item1;
}

public WebElement getItem2() {
	return item2;
}

public WebElement getItem3() {
	return item3;
}

public WebElement getSelectMenu() {
	return selectMenu;
}

public WebElement getOldselect() {
	return oldselect;
}
}
