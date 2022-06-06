package stepDefinitions;

import Base.BaseClass;
import Pom.HeaderElements;
import Runner.RunnerTestClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class StepDef1 extends BaseClass {

HeaderElements he=new HeaderElements(driver);

    @Given("User have a url")
    public void user_have_a_url() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("user enter a url in Headerpage")
    public void user_enter_a_url() {
    getPage("http://demoqa.com");
    }
    @Then("user verified the url is launched")
    public void user_verified_the_url_is_launched() {
    System.out.println("Url is launched");
    }
    @When("user click a Element button")
    public void user_click_a_element_button() {
    	implicitWait();
      javaScript(he.getEle());

    }
  @When("user get the text of Element")
    public void user_get_the_text_of_element() {
    getTheText(he.getText1());
    }
  

	@Then("user is verified in element text")
    public void user_is_verified_in_element_text() {
      assertTest("Elements",he.getText1().getText());
    }


    @When("user click a Forms button")
    public void user_click_a_forms_button() {
    javaScript(he.getForm());
    }
    @When("user get the text of Forms")
    public void user_get_the_text_of_forms() {
     getTheText(he.getText2());
    }
    @Then("user is verified in forms text")
    public void user_is_verified_in_forms_text() {
    assertTest("Forms",he.getText2().getText());
   }


    @When("user click a Alerts,Frames and Windows Button")
    public void user_click_a_alerts_frames_and_windows_button() {
        javaScript(he.getAlts());
    }
    @When("user get the text of Alerts,Frames and windows")
    public void user_get_the_text_of_alerts_frames_and_windows() {
     //getTheText(he.getText3());
    }
    @Then("user is verified in Alerts,Frames,Windows text")
    public void user_is_verified_in_alerts_frames_windows_text() {
    assertTest("Alerts",he.getText3().getText());
    }


    @When("user click the Widgets button")
    public void user_click_the_widgets_button() {
     javaScript(he.getWidget());
    }
    @When("user get the text of widgets")
    public void user_get_the_text_of_widgets() {
    getTheText(he.getText4());
    }
    @Then("user is verified in Widget text")
    public void user_is_verified_in_widget_text() {
        assertTest("Widgets",he.getText4().getText());
    }

    @When("user click a Interactions button")
    public void user_click_a_interactions_button() {
    javaScript(he.getIntern());
    }
    @When("user get the text of Interactions")
    public void user_get_the_text_of_interactions() {
    getTheText(he.getText5());
    }
    @Then("user is verified in Interaction text")
    public void user_is_verified_in_interaction_text() {
    assertTest("Interactions",he.getText5().getText());
   }
    @When("user click a Book store application button")
    public void user_click_a_book_store_application_button() {
    javaScript(he.getBookstore());
    }
    @When("user get the text of Book store Application")
    public void user_get_the_text_of_book_store_application() {
    getTheText(he.getText6());
    }
    @Then("user is verified in BookStore text")
    public void user_is_verified_in_book_store_text() {
     assertTest("Book Store",he.getText6().getText());
    }



}