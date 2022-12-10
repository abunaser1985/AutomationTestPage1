import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test extends ToggleAll {

	
	   @Test
		public void login1() {
	    	
	    	driver.findElement(By.cssSelector("input[type=text]:nth-child(1)")).sendKeys("All7569");
			driver.findElement(By.cssSelector("input[value='Add']")).click();
	
			
			WebElement ToggleAll = driver.findElement(By.cssSelector("body > div.controls > input[type=checkbox]:nth-child(3)"));
			ToggleAll.click();
			WebElement ItemsBox = driver.findElement(By.cssSelector("#todos-content > form:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > input:nth-child(2)"));
	
			
	          if (ToggleAll.isSelected() )
			
			   { 
			       System.out.println ("When the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON:" + ItemsBox.isSelected() ); 
			       
			       
			   } 
			   else 
			   { 
			      System.out.println("When the toggle all check box is CHECKED, all check boxes for list items are not CHECKED ON.");
			   } 
		    
		    
	    }
}
