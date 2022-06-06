package Runner;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;


@RunWith(Cucumber.class)
@CucumberOptions( tags = "@Smoke", 
                 features = "./src/test/java/FeatureFiles",
                 glue = {"stepDefinitions"},
                 stepNotifications = true ,
                 plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true )


public class RunnerTestClass {

	public static WebDriver driver;
	@BeforeClass	
	public static void setUp() {
		driver=BaseClass.initBrowser();

	}


	@AfterClass
	public static void close() {
         driver=BaseClass.quit();
	}
	
}
