package qa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class BlogsLanding extends Baseclass{


	WebDriverWait wait = new WebDriverWait(driver, 40);
	
	//By matchipList =By.id("mat-chip-list-input-0");
	By blogFreelancerButtonClick =By.id("seller-tab");
	By BlogDetails=By.linkText("What’s the best way to use Moonlyte as a Buyer");
	
	public BlogsLanding()
	{
	this.driver=driver;
	}
	
	
	public void clickActionBlog()
	{
	driver.findElement(BlogDetails).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("What’s the best way to use Moonlyte as a Buyer")));
	}	
	

}
