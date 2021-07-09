package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestesActions {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TesteClickAndHold();
	}
	
	public static void TesteTeclado() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement elementoEmail = driver.findElement(By.id("email"));
		WebElement elementoPass = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(elementoEmail, "auihdashui@huadhuis.com").build().perform();
		act.sendKeys(elementoPass, "12314").build().perform();
		
		act.keyDown(elementoEmail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoEmail, " erick").build().perform();
		act.keyUp(elementoEmail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoEmail, " va;entin").build().perform();
	}
	
	public static void TestesActionsMouse() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		Actions act = new Actions(driver);
		
		WebElement inputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement inputSenha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));
		
		act.sendKeys(inputUsername, "tomsmith1").build().perform();
		act.doubleClick(inputUsername).build().perform();
		inputUsername.clear();
		act.sendKeys(inputUsername, "tomsmith").build().perform();
		act.sendKeys(inputSenha, "SuperSecretPassword!").build().perform();
		act.click(butEntrar).build().perform();
		
	}
	
	public static void TesteContextClick() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act = new Actions(driver);
		
		WebElement botao = driver.findElement(By.cssSelector("span.context-menu-one"));
		
		act.contextClick(botao).build().perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1500);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public static void TesteClickAndHold() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		Actions act = new Actions(driver);
		
		WebElement inputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement inputSenha = driver.findElement(By.cssSelector("input[type='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));

		act.sendKeys(inputUsername, "tomsmith").build().perform();
		act.sendKeys(inputSenha, "SuperSecretPassword!").build().perform();
		Thread.sleep(1500);
		act.clickAndHold(butEntrar).build().perform();
	}
}
