package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class HooksConcept  {
public static WebDriver driver;
	@AfterStep
	public static void screenShot(Scenario scr) {
		if (scr.isFailed()) {
			TakesScreenshot sre = (TakesScreenshot) driver;
			byte[] src = sre.getScreenshotAs(OutputType.BYTES);
			scr.attach(src, "image/png", null);
		}
		}
}
