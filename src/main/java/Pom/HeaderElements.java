package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderElements {

	public static WebDriver driver;
	

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[1]")
	private WebElement ele;

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[2]")
	private WebElement form;

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[3]")
	private WebElement alts;

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[4]")
	private WebElement widget;

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[5]")
	private WebElement intern;

	@FindBy(xpath = "(//div[@class='avatar mx-auto white'])[6]")
	private WebElement bookstore;

	@FindBy(xpath = "(//div[text()='Elements'])[1]")
	private WebElement text1;

	@FindBy(xpath = "(//div[text()='Forms'])[1]")
	private WebElement text2;

	@FindBy(xpath = "(//div[text()='Alerts, Frame & Windows'])[1]")
	private WebElement text3;

	@FindBy(xpath = "(//div[text()='Widgets'])[1]")
	private WebElement text4;

	@FindBy(xpath = "(//div[text()='Interactions'])[1]")
	private WebElement text5;

	@FindBy(xpath = "(//div[text()='Book Store'])[1]")
	private WebElement text6;


	public HeaderElements(WebDriver driver) {
		HeaderElements.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getEle() {
		return ele;
	}

	public WebElement getForm() {
		return form;
	}

	public WebElement getAlts() {
		return alts;
	}

	public WebElement getWidget() {
		return widget;
	}

	public WebElement getIntern() {
		return intern;
	}

	public WebElement getBookstore() {
		return bookstore;
	}

	public WebElement getText1() {
		return text1;
	}

	public WebElement getText2() {
		return text2;
	}

	public WebElement getText3() {
		return text3;
	}

	public WebElement getText4() {
		return text4;
	}

	public WebElement getText5() {
		return text5;
	}

	public WebElement getText6() {
		return text6;
	}

}
