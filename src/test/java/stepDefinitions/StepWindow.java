package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pom.HeaderElements;
import Pom.NewTab;
import Runner.RunnerTestClass;
import io.cucumber.java.en.*;

public class StepWindow extends BaseClass {
	HeaderElements he = new HeaderElements(driver);
	NewTab nt=new NewTab(driver);
	

@Given("user enter a url for new window")
public void user_enter_a_url() {
   getPage("http://demoqa.com");
   
}
@When("user click a Alerts,Frames and Windows")
public void user_click_a_alerts_frames_and_windows() {
  javaScript(he.getAlts());
   
}
@When("user click a Browser window")
public void user_click_a_browser_window() {
  javaScript(nt.getWindow());
   
}
@When("user click a new tab")
public void user_click_a_new_tab() {
  javaScript(nt.getTab());
   
}
@Then("user capture a new opened tab")
public void user_capture_a_new_opened_tab() throws Throwable {
	windowHandle();
  capture("C:\\Users\\YS386AD\\IdeaProjects\\SampleProject\\Reports\\ScreenShot\\Newtab.png");
   
}



}
