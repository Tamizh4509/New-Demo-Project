package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pom.DragDrop;
import Pom.HeaderElements;
import Runner.RunnerTestClass;
import io.cucumber.java.en.*;
;
public class StepDefDrag extends BaseClass {
	HeaderElements he=new HeaderElements(driver);
	DragDrop dd=new DragDrop(driver);
	
	@Given("user enter a url for without using drag and drop")
	public void user_enter_a_url() {
getPage("http://demoqa.com");	
	   
	}
	@When("user click a interaction option")
	public void user_click_a_interaction_option() {
	javaScript(he.getIntern());
	   
	}
	@When("user click a droppable option")
	public void user_click_a_droppable_option() {
	javaScript(dd.getDrop());
	   actions("movetoelement", dd.getDrag());
	}
	@When("user click and hold the drag me text")
	public void user_click_and_hold_the_drag_me_text() {
	actions("clickandhold",dd.getDrag());
	   
	}
	@When("user drag the text")
	public void user_drag_the_text() {
	
	   actions("movetoelement", dd.getDropme());
	}
	@When("user drop the option in drop me folder")
	public void user_drop_the_option_in_drop_me_folder() {
	
	  actions("click", dd.getDropme());
	}
	@Then("user verified it")
	public void user_verified_it() throws Throwable {
	capture("C:\\Users\\YS386AD\\IdeaProjects\\SampleProject\\Reports\\ScreenShot\\drop.png");
	   
	}

}
