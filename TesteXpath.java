package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteXpath {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xpathRelativo();
	}

	public static void xpathAbsoluto() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.magazineluiza.com.br/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div/input")).sendKeys("celular");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div[1]/header/div/div[1]/div/div/div[2]/div[2]/div/span")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, 400)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[3]/div/div[2]/ul/li[3]/a[1]/div/img[2]")).click();	
		
	}
	
	public static void xpathRelativo() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.magazineluiza.com.br/");
		
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@id='inpHeaderSearch']")).sendKeys("celular");
		driver.findElement(By.xpath("//*[contains(@title, 'Buscar')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		
		js.executeScript("window.scrollBy(0, 400)");
		
		driver.findElement(By.xpath("//a[contains(@title, 'moto e7 / e7 plus')]")).click();

		js.executeScript("window.scrollBy(0, 400)");
		
		driver.findElement(By.xpath("//*[contains(@alt, 'Smartphone Motorola Moto E7 Plus 64GB Azul Navy')]")).click();
		
	}
}
