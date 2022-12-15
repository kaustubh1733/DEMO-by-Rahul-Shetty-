package locators_multiLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\execute\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https:\\www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Javatpoint");
		driver.findElement(By.name("btnK")).click();

	}

}
