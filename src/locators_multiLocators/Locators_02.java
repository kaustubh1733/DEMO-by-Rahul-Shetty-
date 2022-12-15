package locators_multiLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Locators_02 {

	
	
		
		/*
		
		System.setProperty("webdrivr.gecko.drivr",".\\execute\\geckodrivr.exe");
		
		Webdrivr driv = new Firefoxdrivr();
		
		driv.get("https://demosite.executeautomation.com/Login.html");
		
		driv.findElement(By.name("UserName")).sendKeys("execution");
		
		driv.findElement(By.name("Password")).sendKeys("admin");
		
		driv.findElement(By.name("Login")).click();
		
		*/
	
	@Test
	public void javaScript() {
		
		WebDriverManager.chromedriver().arch64().setup();
		
		WebDriver driv = new ChromeDriver();
		
		driv.get("https://demosite.executeautomation.com/Login.html");
		
		
		
		
		
		
		
		
		
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driv;
		
		WebDriverWait wait = new WebDriverWait(driv,20);
		WebElement user = driv.findElement(By.name("username"));
		wait.until(ExpectedConditions.elementToBeClickable(user));
		
		
		WebElement user1 = driv.findElement(By.name("UserName"));
		
		WebElement pass = driv.findElement(By.name("Password"));
		
		WebElement log = driv.findElement(By.name("Login"));
		
		
		
		
		
		
		
		
		
		
		js.executeScript("document.getElementById('user1').value='execution';");
		
		//driv.findElement(By.name("UserName")).sendKeys("execution");
		
		js.executeScript("document.getElementById('pass').value='admin';");
		
		//driv.findElement(By.name("Password")).sendKeys("admin");
		
		js.executeScript("argument[0].click();", log);
		
		//driv.findElement(By.name("log")).click();
		
		//js.executeScript("document.getElementBy('Login').click();");

	}
}
	

