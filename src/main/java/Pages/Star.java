package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Star {
	
	public void Star_Filter() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html");
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='top']/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[1]/span[2]")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement iframe = driver.findElement(By.id("cross-domain-consent-sharing-iframe"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("uc-btn-accept-banner")).click();
		
		driver.findElement(By.xpath("//input[@id='stars-value-2']")).click();
		
		driver.close();
		
}}
