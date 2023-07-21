package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Tag_Class_Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using Path as a CSS Selector
		 Tag, Class and Attribute
		 Syntax : “tag.class[attribute=value]”
		*/
		
		driver.findElement(By.cssSelector("input.inputtext[tabindex=1]"));

	}

}
