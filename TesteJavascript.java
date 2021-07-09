package framework.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteJavascript {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptTeste2();
	}

	public static void Submarino() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.submarino.com.br/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1500);
		
		js.executeScript("document.getElementById('h_search-input').value='livros';");
		
		Thread.sleep(1500);
		
		js.executeScript("document.getElementById('h_search-btn').click();");
		
		js.executeScript("window.scrollBy(0, 1600)");
		
		Thread.sleep(1500);
		
		WebElement livro = driver.findElement(By.cssSelector("img[alt='Livro - Os miseráveis']"));
		
		js.executeScript("arguments[0].click();", livro);	
		
	}
	
	public static void JavascriptTeste2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement linkCheck = driver.findElement(By.linkText("Checkboxes"));
		
		js.executeScript("arguments[0].click();", linkCheck);
		
		String titulo = js.executeScript("return document.title").toString();
		System.out.println(titulo);
	
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
	
		Thread.sleep(1500);
		
		js.executeScript("arguments[0].checked=true", checkBox);
		
		js.executeScript("alert('O elemento foi checado!');");
		
		Thread.sleep(1500);
		
		Alert alerta = driver.switchTo().alert();
		alerta.accept();
		
		Thread.sleep(1500);
		
		js.executeScript("arguments[0].checked=false", checkBox);
		
		js.executeScript("history.go(0);");
	
	}
	
}
