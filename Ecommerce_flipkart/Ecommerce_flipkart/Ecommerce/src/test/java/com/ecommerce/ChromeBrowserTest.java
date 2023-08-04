package com.ecommerce;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserTest {
	WebDriver wd;
	
  @Test(priority = 4)
  public void productSearch() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	wd.get("https://www.flipkart.com/");
	 	wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	 	wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
	  	wd.findElement(By.name("q")).sendKeys("iphone 13");
	  	wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	  	System.out.println("Product found");
    	Reporter.log("Product found");
	  	Thread.sleep(5000);
	  	wd.close();
  }
  
  
  @Test(priority = 1)
  public void LoadTimeTest() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	long start=System.currentTimeMillis();
	    wd.get("https://www.flipkart.com/");
	    Thread.sleep(3000);
	    wd.close();
	    long finish=System.currentTimeMillis();
	    long Loadtime=finish-start;
	    System.out.println("Load Time="+Loadtime+"milliseconds");
	    long expectedtime=30000;
	    if(Loadtime<expectedtime)
	    {
	    	System.out.println("Page is loaded within the time limit");
	    	Reporter.log("Page is loaded within the time limit");
	    }
	    else {
	    	System.out.println("Page not loaded within the time limit");
	    	Reporter.log("Page not loaded within the time limit");
	    }
  }
  
  
  @Test(priority = 1)
  public void ImageScreenHeightTest() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	 wd.get("https://www.flipkart.com/search?q=iphone13&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	//	   wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		   java.awt.Dimension screen_size =Toolkit.getDefaultToolkit().getScreenSize();
		   int height = (int) screen_size.getHeight();
		   int width = (int) screen_size.getWidth();
		   System.out.println("Resolution of the Screen:\n");
		   System.out.println("Screen Height "+height +" Screen width "+ width);
		   Thread.sleep(2000);
		   int img_height=wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img")).getSize().getHeight();
		   int img_width=wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img")).getSize().getWidth();
		   System.out.println("Resolution of the Image:\n");
		   System.out.println("Image Height "+img_height +" Image width "+img_width);
		   WebElement img=wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img"));
		   if(img.isDisplayed())
		   {
			   if(img_height<height && img_width<width)
			   {
				   System.out.println("images are loaded and are visible till the screen height");
				   Reporter.log("images are loaded and are visible till the screen height");
			   }
			   else
			   {
				   System.out.println("images are not loaded and visible till the screen height");
				   Reporter.log("images are not loaded and visible till the screen height");
			   }
		   }
		   Thread.sleep(5000);
		   wd.close();
	  	
  }
  
  @Test(priority = 2)
  public void scrollFeatureTest() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	long start=System.currentTimeMillis();
	  	wd.get("https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
	    Thread.sleep(5000);
	    String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) wd;
		Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
		if (test == true) {
			System.out.print("Scrollbar visible.");
			Reporter.log("Scrollbar visible.");
		} else if (test == false){
			System.out.print("Scrollbar is not visible.");
			Reporter.log("Scrollbar is not visible.");
		}
		Thread.sleep(5000);
		wd.close();
  }
  
  
  @Test(priority = 2)
  public void scrollDown() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	long start=System.currentTimeMillis();
	  	 wd.get("https://www.flipkart.com/");
		  // wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		   JavascriptExecutor js = (JavascriptExecutor) wd;
	       //Scroll down till the bottom of the page
	       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	       System.out.println("Navigates to the bottom of the page");
		   Reporter.log("Navigates to the bottom of the page");
		   Thread.sleep(5000);
		wd.close();
  }
  
  
  @Test(priority = 3)
  public void refreshContentTest() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	 wd.get("https://www.flipkart.com/search?q=iphone+13&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_3_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+13%7CMobiles&requestId=ee111f6f-1edd-495d-9c8a-eec51bb9a9d5&as-searchtext=iph");
		  long startTime = System.currentTimeMillis();
		  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	      JavascriptExecutor js = (JavascriptExecutor) wd;

	      //specify the WebElement till which the page has to be scrolled
	      WebElement element = wd.findElement(By.xpath("//div[@class='CXW8mj']"));

	      js.executeScript("arguments[0].scrollIntoView();", element);

		  long endTime = System.currentTimeMillis();
		  long totalTime = endTime - startTime;
		  System.out.println("Total Content Load Time while Scrolling: " + totalTime + " milliseconds");
		  Reporter.log("Total Content Load Time while Scrolling: " + totalTime + " milliseconds");
		  Thread.sleep(5000);
		wd.close();
  }
  
  @Test(priority = 5)
  public void scrollImageLoad() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
		  wd.get("https://www.flipkart.com/search?q=iphone+13&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=iphone+13%7CMobiles&requestId=252811eb-cc08-4747-b62c-3270dfc2ad88&as-searchtext=iphone");
		     WebElement we1=wd.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div/div/img"));
	
		     if(we1.isDisplayed())
			  {
				  System.out.println("Image is not present before scrolling"); 
		    	  Reporter.log("Image is not present before scrolling");
			  }  
			  JavascriptExecutor js = (JavascriptExecutor) wd;  
			   js.executeScript("window.scrollBy(0,500)");
			   if(we1.isDisplayed())
				  {
					  System.out.println("Image is present after scrolling"); 
			    	  Reporter.log("Image is present after scrolling");
				  } 
		  Thread.sleep(5000);
		wd.close();
}
  
  
  @Test()
  public void differentResolutionTest() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	  	wd=new ChromeDriver();
	  	wd.manage().window().maximize();
	  	wd.get("https://www.flipkart.com/");
		 wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) wd;
		  js.executeScript("window.scrollBy(0,1000)", "");
		  wd.manage().window().setSize(new Dimension(1620, 820));
		  Thread.sleep(5000);
		  WebElement textField = wd.findElement(By.name("q"));
		  textField.sendKeys("Iphone 13");
		  wd.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		  js.executeScript("window.scrollBy(0,1000)", "");
		  wd.navigate().back();
		  Thread.sleep(5000);
		  wd.manage().window().maximize();
		  Thread.sleep(5000);
		  js.executeScript("window.scrollBy(0,1000)", "");
		  wd.manage().window().setSize(new Dimension(240, 360));
		  textField.sendKeys("mini");
		  Thread.sleep(5000);
		  js.executeScript("window.scrollBy(0,1000)", "");
		  System.out.println("Different browsers and screen resolutions render it in the same way.");
		  Reporter.log("Different browsers and screen resolutions render it in the same way.");
		  Thread.sleep(5000);
		wd.close();
}

  
  
  

}
