package stepDefinitions;



import Base.BaseClass;
import Pom.ClickMe;
import Pom.HeaderElements;
import io.cucumber.java.en.*;

public class StepClick extends BaseClass  {
	
HeaderElements he=new HeaderElements(driver);
ClickMe cm=new ClickMe(driver);


    @Given("user enter a url for click option")
    public void user_enter_a_url() {
       getPage("http://demoQa.com");

    }
    @When("user click a Elements")
    public void user_click_a_element() {
       javaScript(he.getEle());
    }
    @Then("user click a buttons")
    public void user_click_a_buttons() {
    javaScript(cm.getRighttext());
    
   
    }
    @When("user click a double click option")
    public void user_click_a_double_click_option() {
     actions("movetoElement", cm.getDoubleClick());	
     actions("doubleclick", cm.getDoubleClick());
    }
    @Then("user verified a double click is clicked")
    public void user_verified_a_double_click_is_clicked() {
    	implicitWait();
    getTheText(cm.getDbltext());
    }

    
    @Given("user is in element page")
    public void user_is_in_element_page() {

    }
    @When("user click a right click button")
    public void user_click_a_right_click_button() {
    actions("movetoElement", cm.getRight());	
    actions("rightclick", cm.getRight());
    }
    @Then("user verified a right click is clicked")
    public void user_verified_a_right_click_is_clicked() {
    implicitWait();	
    getTheText(cm.getRighttext());
    }

}
