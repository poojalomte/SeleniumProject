package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
	public void page_title_exists() {
		
		  WebDriverManager.chromedriver().setup(); WebDriver driver = new
		  ChromeDriver(); driver.get(
		  "https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html"
		  );
		 
		
	    String s = driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='top']/div[1]/div[1]/div[2]/h1[1]/span[1]")).getText();
		System.out.println(s);
		
		Assert.assertEquals(s, "Jalousiescout.de");
		
		driver.close();

}}
