package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using LinkText as a Locator
		 Finding  Web element using Locator Link Text
		 Syntax : link =  partialLink  of the element
		*/
		
		driver.findElement(By.partialLinkText("plink"));
	
	}

}