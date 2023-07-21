package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		/*
		 Using CSS Selector as a Locator
		 Tag and ID
		 Syntax :”css = tag#id”
		*/
		
		driver.findElement(By.cssSelector("input#email"));
	
		/*
		 Using CSS Selector as a Locator
		 Tag and Class
		 Syntax : “css = tag.class”
		*/
		
		driver.findElement(By.cssSelector("input.inputtext"));
		
		/*
		 Using CSS Selector as a Locator
		 Tag and Attribute
		 Syntax : “css = tag[attribute=value]”
		*/
		
		driver.findElement(By.cssSelector("input[name=lastName]"));
		
		/*
		 Using CSS Selector as a Locator
		 Tag, Class and Attribute
		 Syntax : “tag.class[attribute=value]”
		*/
		
		driver.findElement(By.cssSelector("input.inputtext[tabindex=1]"));
		
		/*
		 Using CSS Selector as a Locator
		 Inner text
		 Syntax : ”css = tag.contains(“innertext”)”
		*/
		
		driver.findElement(By.cssSelector("font:contains(“Boston”)"));
		
	}

}