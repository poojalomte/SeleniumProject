package Checks;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Grade;

public class TestCases2 {

	@Test
	public void searchgrade() {
		// TODO Auto-generated method stub
		Grade g = new Grade();
		g.Grade_exists();
		Assert.assertTrue(g.Grade_exists(),"Grade is leass than 0");
	
		

	}

}
