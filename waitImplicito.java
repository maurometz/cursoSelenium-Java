package framework.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitImplicito {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TesteWaitExplicito();
	}

	public static void TesteWaitImplicito() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
		
		driver.findElement(By.xpath("//button")).click();
		
		WebElement textoHelloWorld = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		
		System.out.println(textoHelloWorld.getAttribute("innerText").toString());
	}
	
	public static void TesteWaitExplicito() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.xpath("//button")).click();
		
//		Thread.sleep(2000);
//		
//		WebElement textoHelloWorld = driver.findElement(By.xpath("//div[@id='finish']/h4"));
//		
//		
		
//		WebElement textoHelloWorld = (new WebDriverWait(driver,20)).until(ExpectedCondition.elementToBeClickable(By.xpath("//div[@id='finish']/h4")));

//		textoHelloWorld.click();
		
//		System.out.println(textoHelloWorld.getAttribute("innerText").toString());
		
	}
}
