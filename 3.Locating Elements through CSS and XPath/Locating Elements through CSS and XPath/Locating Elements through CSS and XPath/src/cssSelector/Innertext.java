package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Innertext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using Path as a CSS Selector
		 Inner text
		 Syntax : ”css = tag.contains(“innertext”)”
		*/
		
		driver.findElement(By.cssSelector(font:contains("Boston")));

	}

}
