package externalPopUps;

import org.openqa.selenium.edge.EdgeDriver;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		//To click on ‘OK’ button in pop up
		EdgeDriver driver = new EdgeDriver();
		driver.switchTo().alert().accept();
		
		//To click on ‘Cancel’ button in pop up
		EdgeDriver driver1 = new EdgeDriver();
		driver1.switchTo().alert().dismiss();
		
		//To Capure the alert message
		EdgeDriver driver2 = new EdgeDriver();
		driver2.switchTo().alert().getText();
		
		//To enter the information
		EdgeDriver driver3 = new EdgeDriver();
		driver3.switchTo().alert().sendKeys("text");
		
		//To exit from the popup
		EdgeDriver driver4 = new EdgeDriver();
		driver4.switchTo().alert().close();

	}

}
