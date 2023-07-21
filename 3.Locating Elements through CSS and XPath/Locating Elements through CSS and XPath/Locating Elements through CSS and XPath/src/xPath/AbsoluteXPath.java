package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using Xpath as a Locator
		 Absolute XPath
		 Syntax : html/body/div[1]/div[1]/div/h4[1]/b
		*/
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/h4[1]/b"));


	}

}