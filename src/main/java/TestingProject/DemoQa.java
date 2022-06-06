package TestingProject;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa extends BaseClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\YS386AD\\IdeaProjects\\SampleProject\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demoqa.com");
        WebElement ele=driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();",ele);
        WebElement element=driver.findElement(By.xpath("(//div[text()='Elements'])[1]"));
       String text = element.getText();
      System.out.println(text);


    }
}
