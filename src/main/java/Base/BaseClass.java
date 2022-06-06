package Base;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.reporter.FileUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BaseClass {
public static WebDriver driver;
   
public static  WebDriver initBrowser(){
   System.setProperty("webdriver.chrome.driver","C:\\Users\\YS386AD\\IdeaProjects\\SampleProject\\Driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
	return driver;
       
    }

 public static WebDriver getDriver() {
	return driver;
	// TODO Auto-generated method s
 }
   public static  WebDriver quit() {
    driver.quit();
	return driver;
	
}

    public static void getPage(String url){
        driver.get(url);

    }

    public static void inputValues(WebElement element,String value){
        element.sendKeys(value);
    }
    public static void click(WebElement element){
        element.click();
    }

    public static void getTheText(WebElement element){
        String text=element.getText();
        System.out.println(text);
    }

    public static void javaScript(WebElement ele){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",ele);
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void assertTest(String expected, String ele) {
        Assert.assertEquals(expected,ele);
    }
    public static void actions(String type,WebElement ele) {
    	Actions act=new Actions(driver);
     if (type.equalsIgnoreCase("click")) {
	act.click().build().perform();	
	}
     else if (type.equalsIgnoreCase("doubleclick")) {
    	 act.doubleClick().build().perform();
		
	}
     else if (type.equalsIgnoreCase("movetoelement")) {
    	 act.moveToElement(ele).build().perform();
		
	}
     else if (type.equalsIgnoreCase("rightclick")) {
		act.contextClick().build().perform();
	}
     else if (type.equalsIgnoreCase("clickandhold")) {
		act.clickAndHold().build().perform();
	}
     else {
		System.out.println("Not performed");
	}
	}
    
    public static void capture(String path) throws Throwable {
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src = scr.getScreenshotAs(OutputType.FILE);
		File f=new File(path);
       FileUtils.copyFile(src, f);
	
}

public static void windowHandle() {
 String parent = driver.getWindowHandle();
	 
 Set<String> child = driver.getWindowHandles();
 
 Iterator<String> iterator = child.iterator();
 while (iterator.hasNext()) {
	String next = iterator.next();
	
	if (parent.equalsIgnoreCase(next)) {
		
		driver.switchTo().window(parent);
		System.out.println(driver.switchTo().window(next).getTitle());
	}
	}
}
public static void max() {
driver.manage().window().maximize();

}
public static void dropDown(WebElement ele,String type,String name) {
    Select s=new Select(ele);
	
   if (type.equalsIgnoreCase("index")) {
	    int num=Integer.parseInt(name);
	    s.selectByIndex(num);
	}
   else if (type.equalsIgnoreCase("value")) {
		s.selectByValue(name);
	}
   
   }
public static void dragAndDrop(WebElement ele1,WebElement ele2) {
Actions act=new Actions(driver);
act.dragAndDrop(ele1, ele2).build().perform();
}
}