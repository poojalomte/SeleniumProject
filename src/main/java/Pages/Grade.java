package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Grade {


	public boolean Grade_exists() {
		
		
		  WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.trustedshops.de/bewertung/info_X77B11C1B8A5ABA16DDEC0C30E7996C21.html" );
		 
		 
		
		String element = driver.findElement(By.xpath("//body/div[@id='__next']/div[@id='top']/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/span[1]")).getText();
		System.out.println(element);
		int grade;
		
		if (element == null) {
			return false;
			
		}
		
	
		grade = Integer.parseInt(element.split(",")[0]); 	
	
		 
		 if(grade!=0){
			System.out.println("grade is present and not 0");
         return true;
			  
			   }
			   else{
				  
				   return false;
		
}}}
