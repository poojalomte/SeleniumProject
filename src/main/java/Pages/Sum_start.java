package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sum_start {

public void sum() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html");
		
		String element2 = driver.findElement(By.xpath("//span[contains(text(),'85')]")).getText();
	    int e = Integer.parseInt(element2);
		System.out.println(e);
		
		
		String element3 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[2]/div[3]/span[1]")).getText();
		int e2 = Integer.parseInt(element3);
		System.out.println(e2);
		
		
		String element4 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[3]/div[3]/span[1]")).getText();
		int e3 = Integer.parseInt(element4);
		System.out.println(e3);
		
		
		String element5 = driver.findElement(By.xpath("//span[contains(text(),'< 1')]")).getText();
		String numStr = element5.replaceAll("\\D+", ""); // removes all non-digit characters
		int e4 = Integer.parseInt(numStr); // parses the remaining digits as an integer
        System.out.println(e4);
	
	
		String element6 = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/a[5]/div[3]/span[1]")).getText();
		int e5 = Integer.parseInt(element6);
		System.out.println(e5);
		
		
		int sum = e + e2 + e3 + e4 + e5;
		System.out.println(sum);
		
		
		// assert that the value is equal to or below 100
		
		Assert.assertTrue(sum <= 100);
		
		
		
}}
