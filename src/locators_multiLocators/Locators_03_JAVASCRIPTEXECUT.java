package locators_multiLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_03_JAVASCRIPTEXECUT {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\execute\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_372n4kkaxf_e&adgrpid=60456322738"
				+ "&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=17813084409397478217&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hv"
				+ "locphy=9040235&hvtargid=kwd-298441377801&hydadcr=14451_2154369&gclid=EAIaIQobChMI4_WWyqaw-QIVB9dMAh3vhAxjEAAYASAAEgLlW_D_BwE");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		////div[@id='nav-xshop']/a[2]
		
	WebElement srch = driver.findElement(By.xpath("//input[@type='text']"));
		
		js.executeScript("arguments[0].value='Samsung';",srch);
		
		WebElement cl = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]"));
		
		js.executeScript("arguments[0].click();", cl);
		
	
		js.executeScript("history.go(0)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		

	}

}
