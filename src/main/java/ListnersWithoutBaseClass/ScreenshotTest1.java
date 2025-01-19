package ListnersWithoutBaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listerners.ListenersMethod;

@Listeners(ListenersMethod1.class)
public class ScreenshotTest1 {

public static WebDriver driver;
	
   @BeforeMethod
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	 @AfterMethod
     public void tearDown() 
     {
    	 driver.quit();
     }
      @Test
     public void TakeScreenShot1()
     {
    	Assert.assertEquals(false, true); 
     }
     
     @Test
     public void TakeScreenShot2()
     {
    	Assert.assertEquals(false, true); 
     }
     
	public void failed(String MethodName)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\kumar\\eclipse-workspace\\TestNgProject2\\screenshots\\"+ MethodName +".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
