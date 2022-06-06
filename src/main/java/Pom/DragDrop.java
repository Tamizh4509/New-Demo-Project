package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDrop {
	
public static WebDriver driver;

@FindBy(xpath="//span[text()='Droppable']")
private WebElement drop;

@FindBy(id="draggable")
private WebElement drag;

@FindBy(id="droppable")
private WebElement dropme;

public DragDrop(WebDriver driver) {
	DragDrop.driver=driver;
PageFactory.initElements(driver, this);
}

public WebElement getDrop() {
	return drop;
}

public WebElement getDrag() {
	return drag;
}

public WebElement getDropme() {
	return dropme;
}


}
