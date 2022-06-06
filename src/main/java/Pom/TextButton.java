package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextButton {
	
public static WebDriver driver;

@FindBy(xpath="//span[text()='Text Box']")
private WebElement textbox;

@FindBy(id="userName")
private WebElement username;

@FindBy(id="userEmail")
private WebElement mail;

@FindBy(id="currentAddress")
private WebElement current;

@FindBy(id="permanentAddress")
private WebElement permanent;

@FindBy(id="submit")
private WebElement submit;

public TextButton(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

}

public WebElement getTextbox() {
	return textbox;
}

public WebElement getUsername() {
	return username;
}

public WebElement getMail() {
	return mail;
}

public WebElement getCurrent() {
	return current;
}

public WebElement getPermanent() {
	return permanent;
}

public WebElement getSubmit() {
	return submit;
}

}
