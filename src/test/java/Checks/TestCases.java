package Checks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Homepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	@Test
	public void title() {
		Homepage h = new Homepage();
		h.page_title_exists();
		

	}

}
