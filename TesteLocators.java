package framework.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLocators {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TesteCssSelectorSubString();
	}

	public static void TesteFacebook() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("email@email.com");
		driver.findElement(By.id("pass")).sendKeys("12346");
		driver.findElement(By.name("login")).click();
	}

	public static void TesteTagName() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		List<WebElement> div = driver.findElements(By.tagName("div"));
		
		System.out.println("Quantidade de div: " + div.size());
		
		for (WebElement webElement : div) {
			System.out.println(webElement.getText());
		}

		
	}
	
	public static void TesteClassName() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.trivago.com.br");
		
		driver.findElement(By.className("siteheader__control")).click();
		
	}

	
	public static void TesteText() {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.partialLinkText("Esqueceu")).click();
		
	}
	
	public static void TesteCssSelector() {
		
		//Não funciona porque os ids e classes são dinâmicos
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");
		driver.findElement(By.cssSelector("data-testid#royal_login_button")).click();
		
		
	}
	
	public static void TesteCssClass() {
		
		//Não funciona porque os ids e classes são dinâmicos
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input.classeaqui")).sendKeys("email@email.com");
	}
	
	public static void TesteCssAtributo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("123456");
		driver.findElement(By.cssSelector("button[type=submit]")).click();
	}
	
	public static void TesteCssSelectorSubString() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.cssSelector("input[name^=ema]")).sendKeys("email@email.com");
		driver.findElement(By.cssSelector("input[id^=pa]")).sendKeys("12456");
		
	}
}
