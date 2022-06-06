package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickMe {

public static WebDriver driver;
	
@FindBy(xpath="//span[text()='Buttons']")	
private WebElement button;

@FindBy(xpath="//button[text()='Double Click Me']")
private WebElement doubleClick;


@FindBy(xpath="//p[text()='You have done a double click']")
private WebElement dbltext;

@FindBy(xpath="//button[text()='Right Click Me']")
private WebElement right;

@FindBy(xpath="//p[text()='You have done a right click']")
private WebElement righttext;

public ClickMe(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getButton() {
	return button;
}

public WebElement getDoubleClick() {
	return doubleClick;
}

public WebElement getRight() {
	return right;
}
public WebElement getDbltext() {
	return dbltext;
}

public WebElement getRighttext() {
	return righttext;
}
}
