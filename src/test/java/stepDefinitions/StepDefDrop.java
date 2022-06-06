package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pom.HeaderElements;
import Pom.NewTab;
import Runner.RunnerTestClass;
import io.cucumber.java.en.*;

public class StepDefDrop extends BaseClass {
	HeaderElements he=new HeaderElements(driver);
	NewTab nt=new NewTab(driver);

@Given("user enter a url for dropdown")
public void user_enter_a_url() {
getPage("http://demoqa.com");
   
}
@When("user click a widgets option")
public void user_click_a_widgets_option() {
javaScript(he.getWidget());
   
}
@When("user click a select menu option")
public void user_click_a_select_menu_option() {
javaScript(nt.getSelectMenu());
   
}
@When("user select a the old style menu for any option")
public void user_select_a_the_old_style_menu_for_any_option() {
  dropDown(nt.getOldselect(), "value", "3");
   
}
@Then("user verified")
public void user_verified() {
System.out.println("Dropdown is selected");
}



}
