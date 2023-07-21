package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using Xpath as a Locator
		 Relative XPath
		 Syntax :  //*[@class=’relativexapath’]
		*/
		
		driver.findElement(By.xpath("//*[@class='relativexapath']"));



	}

}