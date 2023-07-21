package newTabsandnewWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTabsandNewWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		//Opening new tab
		EdgeDriver driver = new EdgeDriver();
		driver.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "t");
		
		//Opening new Window
		EdgeDriver driver1 = new EdgeDriver();
		driver1.findElement(By.id("xyz")).sendKeys(Keys.CONTROL + "w");
		 
	}

}
