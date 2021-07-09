package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteComandosNavegacao {
	
	static WebDriver driver;

	public static void main(String[] args) {
		navegacao();
	}
	
	public static void navegacao() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/watch?v=wELOA2U7FPQ&ab_channel=JasonLewis-MindAmend");
	
	driver.navigate().to("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("resident evil 2 remake");
	
	Actions act = new Actions(driver);
	
	act.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.linkText("Imagens")).click();
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	driver.quit();
	
	}
}
