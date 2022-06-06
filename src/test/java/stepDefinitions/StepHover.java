package stepDefinitions;

import Base.BaseClass;
import Pom.HeaderElements;
import Pom.NewTab;
import io.cucumber.java.en.*;

public class StepHover extends BaseClass {
HeaderElements he=new HeaderElements(driver);
NewTab nt=new NewTab(driver);
	

@Given("user enter the url for hover")
public void user_enter_the_url() {
    
   getPage("http://demoqa.com");
}
@When("user click a widgets")
public void user_click_a_widgets() {
    javaScript(he.getWidget());
   
}
@When("user click a menu option")
public void user_click_a_menu_option() {
   javaScript(nt.getMenu());
   
}
@When("user hover the menu item2")
public void user_hover_the_menu_item2() {
    actions("movetoelement", nt.getItem1());
   
}
@When("user hover the sub-sublist")
public void user_hover_the_sub_sublist() {
    actions("movetoElement", nt.getItem2());
   
}
@When("user hover the sub-sub item2")
public void user_hover_the_sub_sub_item2() {
    
   actions("movetoelement",nt.getItem3());
}
@Then("user capture the page")
public void user_capture_the_page() throws Throwable {
    
   capture("C:\\Users\\YS386AD\\IdeaProjects\\SampleProject\\Reports\\ScreenShot\\hover.png");
}

}
