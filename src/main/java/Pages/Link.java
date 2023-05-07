package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public void Link_click() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html");
	
    driver.findElement(By.xpath("//a[contains(text(),'Wie berechnet sich die Note?')]")).click();
    
    String s = driver.findElement(By.xpath("//span[contains(text(),'Lesen Sie die Bewertungen anderer Kundinnen und Ku')]")).getText();
	System.out.println(s);
	
	Assert.assertEquals(s, "Lesen Sie die Bewertungen anderer Kundinnen und Kunden von Jalousiescout.de als Orientierungshilfe!");
	
	driver.close();
}}
