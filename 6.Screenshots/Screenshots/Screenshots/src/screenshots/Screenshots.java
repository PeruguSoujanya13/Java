package screenshots;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\bhabn\\Downloads\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
	    WebElement upload = driver.findElement(By.xpath("//*[@type='text']"));
	    upload.click();
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	    File scr = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scr, new File("/Screenshot/test.png"));
	}

}
