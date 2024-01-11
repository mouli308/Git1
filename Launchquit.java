package amazon;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launchquit 
{
	
		ChromeDriver driver;
		@BeforeMethod
		public void launch()
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@AfterMethod
		public void quit()
		{
			
			driver.quit();
		}

}

