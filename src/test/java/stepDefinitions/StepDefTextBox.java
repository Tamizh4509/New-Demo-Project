package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pom.HeaderElements;
import Pom.TextButton;
import Runner.RunnerTestClass;
import io.cucumber.java.en.*;

public class StepDefTextBox extends BaseClass{
	
	HeaderElements he=new HeaderElements(driver);
	TextButton tb=new TextButton(driver);


@Given("user enter a url for textbox")
public void user_enter_a_url() {
	getPage("http://demoQa.com");
   
}
@When("user click a Element")
public void user_click_a_element() {
	javaScript(he.getEle());
   
}
@When("user click a text box")
public void user_click_a_text_box() {
	click(tb.getTextbox());
   
}
@When("user enter a full name as {string}")
public void user_enter_a_full_name_as(String string) {
	inputValues(tb.getUsername(), string);
}
@When("user enter a  Email as {string}")
public void user_enter_a_email_as(String string) {
	inputValues(tb.getMail(), string);
}
@When("user enter a current address")
public void user_enter_a_current_address() {
	inputValues(tb.getCurrent(),"23,pqrk street,pazhail,chennai");
}
@When("user enter a permananat address")
public void user_enter_a_permananat_address() {
	inputValues(tb.getPermanent(),"23,pqrk street,pazhail,chennai");
}
@Then("user click a submit button and verified it")
public void user_click_a_submit_button_and_verified_it() {
	 javaScript(tb.getSubmit());
}



}
