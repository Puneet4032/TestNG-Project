package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project {
	@Test
	public void title() throws Exception{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\death\\Downloads\\chromedriver_win32\\chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("http://automationpractice.com/index.php");
     
     String actualTitle = "My Store";
     String expectedTitle = driver.getTitle();
     
     Assert.assertEquals(expectedTitle, actualTitle);
     System.out.println("Test Case Passed");
    
	}
	
	@Test
	public void logo() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\death\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     ChromeDriver driver = new ChromeDriver();
	     
	     driver.get("http://automationpractice.com/index.php");
	     
		 WebElement logo = driver.findElement(By.className("logo")  );
         Assert.assertEquals(true, logo.isDisplayed());
         System.out.println("Test case passed");
	}

}



