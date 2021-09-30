package package1;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@Parameters("URL")
	@Test

	private void loginbankloan1(String name1) {

		System.out.println("loginbankloan1");
		System.out.println(name1);
	}

	@Test

	private void loginbankloan2() {
		System.out.println("loginbankloan2");
		Assert.assertEquals(true, false);

	}
	
	

	@Test(dataProvider = "getdata" )

	private void loginbankloan3(String name, String nam) {
				
		System.out.println(name);
		System.out.println(nam);

	}

	@Test

	private void loginbankloan4() {
		System.out.println("loginbankloan4");

	}

	@DataProvider
	private Object[][] getdata() {
		
		Object [][] data = new Object[2][2];
		data[0][0]= "Shake";
		data[0][1]= "Mohammad";
		data[1][0]= "Tauhid";
		data[1][1]= "Aaiam";
		
		return data;
		

	}

}
