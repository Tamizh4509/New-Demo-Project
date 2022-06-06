package stepDefinitions;



import Base.BaseClass;
import Pom.DragDrop;
import Pom.HeaderElements;
import io.cucumber.java.en.*;

public class StepDragandDrop extends BaseClass {
	HeaderElements he=new HeaderElements(driver);
	DragDrop dd=new DragDrop(driver);
	

@Given("user enter the url for drag and drop")
public void user_enter_the_url() {
    getPage("http://demoqa.com");
   
}
@When("user click the interaction option")
public void user_click_the_interaction_option() {
    javaScript(he.getIntern());
   
}
@When("user click the droppable option")
public void user_click_the_droppable_option() {
    javaScript(dd.getDrop());
   
}
@When("user drag and drop the value")
public void user_drag_and_drop_the_value() {
    
   dragAndDrop(dd.getDrag(), dd.getDropme());
}
@Then("user verified a drop")
public void user_verified() {
    
   System.out.println("Dropped");
}

	
}
