package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		Using ID as a Locator
		Finding  Web element using Locator ID
		Syntax : id = id of the element
		*/

		driver.findElement(By.id("Email"));
		
	}

}
