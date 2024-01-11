package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_cardspay extends Launchquit{
	@Test
	public void cardspay()
	
	{
		WebElement field= driver.findElement(By.id("twotabsearchtextbox"));
		field.sendKeys("Safari");
		List<WebElement> a1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		a1.get(3).click();
		
		WebElement e1=driver.findElement(By.xpath("//img[@class='s-image'][1]"));
		e1.click();
		
		WebElement button=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		button.click();
		
		
	}

}
