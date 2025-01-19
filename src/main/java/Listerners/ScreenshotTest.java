package Listerners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersMethod.class)

public class ScreenshotTest extends Base {
    
	
	
	@BeforeMethod
	public void setup() 
	{
    	 initialization();
	
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
}
