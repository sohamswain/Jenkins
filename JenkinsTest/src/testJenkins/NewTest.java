package testJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
	  WebDriver driver=new ChromeDriver();
	  System.out.println("Jenkins project");
	  //WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
	  System.out.println("facebook loaded");
	  //driver.findElement(By.id(""));
	  
  }
}
