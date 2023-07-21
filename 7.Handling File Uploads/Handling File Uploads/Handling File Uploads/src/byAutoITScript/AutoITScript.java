package byAutoITScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoITScript {
	
	 private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	    driver.get("http://toolsqa.com/automation-practice-form");
	 
	    driver.findElement(By.id("photo")).click();
	 
	    Runtime.getRuntime().exec("D:\AutoIt\AutoItTest.exe");
	 
	    Thread.sleep(5000);
	 
	    driver.close();


	}

}
