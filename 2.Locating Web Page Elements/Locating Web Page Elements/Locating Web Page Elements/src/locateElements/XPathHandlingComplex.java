package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class XPathHandlingComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Contains();
		 Syntax : “xpath = //*[contains(text(),’text’)]
		*/
		
		driver.findElement(By.xpath("//*[contains(text(),’sub’]"));
	
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Using OR & AND
		 Syntax : xpath=//*[@type=’submit’ or @name=’btnReset’]
		*/
		
		driver.findElement(By.xpath("=//*[@type=’submit’ or @name=’btnReset’]"));
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Start-with function
		 Syntax : xpath= //label[starts-with(@id,’message’)]
		*/
		
		driver.findElement(By.xpath("//label[starts-with(@id,'message')]"));
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Text();
		 Syntax : xpath=//td[text()=’UserID’]
		*/
		
		driver.findElement(By.xpath("=//td[text()='UserID']"));
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Following
		 Syntax : xpath=//*[@type=’text’]//following::input
		*/
		
		driver.findElement(By.xpath("=//*[@type='text']//following::input"));
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Preceding
		 Syntax : xpath=//*[@type=’text’]//preceding::input
		*/
		
		driver.findElement(By.xpath("//*[@type='text']//preceding::input"));
		
		/*
		 Using Xpath Handling complex and Dynamic elements
		 Following - sibling
		 Syntax : xpath=//*[@type=’submit’]//preceding::input
		*/
		
		driver.findElement (By.xpath ("//*[@type='text']//following-sibling::input"));
		
	}

}