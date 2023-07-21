package bySendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		
		//pass the path of the file to be uploaded using Send keys method
		browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");

	}

}
