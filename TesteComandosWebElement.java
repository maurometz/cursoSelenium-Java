package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosWebElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		webElement();
	}
	
	public static void webElement() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/watch?v=wELOA2U7FPQ&ab_channel=JasonLewis-MindAmend");
		
		driver.findElement(By.id("search")).sendKeys("resident evil 2 remake speedrun");
		
		driver.findElement(By.id("search-icon-legacy")).sendKeys(Keys.ENTER);
		
		boolean apareceu;
		
		apareceu = driver.findElement(By.id("search")).isDisplayed();
		System.out.println("apareceu");
		
		boolean habilitado;
		
		habilitado = driver.findElement(By.id("search")).isEnabled();
		System.out.println("habilitado");
		
//		boolean selecionado = driver.findElement(By.name(null)).isSelected();
//		System.out.println("selecionado");
		
		driver.findElement(By.id("search-icon-legacy")).submit();
		
		String textodoLink;
		
		textodoLink = driver.findElement(By.linkText("Upbeat Study Music - Deep Focus for Complex Tasks")).getText();
	}
}
