package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteComandosBrowser {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		comandosBrowser();
	}
	
	public static void comandosBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com.br");
		
		String titulo = driver.getTitle();
		System.out.println(titulo);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String codigoFonte = driver.getPageSource();
		//System.out.println(codigoFonte);
		
		driver.close();
	}
}
