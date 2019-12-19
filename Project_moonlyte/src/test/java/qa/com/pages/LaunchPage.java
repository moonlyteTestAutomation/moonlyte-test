package qa.com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class LaunchPage extends Baseclass{

	WebDriverWait wait = new WebDriverWait(driver, 30);
	By matchipList =By.id("mat-chip-list-input-0");
	By blogButtonLink =By.linkText("Blog");
	By signInLinkClick=By.xpath("//*[@id='mlui02']");
	By registerLinkClick=By.xpath("//*[@id='mlui01']");
	//By freelancerLinkClick=By.tagName("a");
	

	By freelancerLinkClick=By.xpath("//a[contains(text(),'Freelancer')]");
	
	
	By BusinessLinkclick=By.xpath("//a[contains(text(),'Business')]");
	
	
	
	
	
	
	public LaunchPage() {
		// TODO Auto-generated constructor stub
	}
	public void set_matchip_list(String text){
		
//	driver.findElement(matchipList).sendKeys(text);
	
	}
	
	public void blogButtonClick()
	
	
	{
		
		
		driver.findElement(blogButtonLink).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blog")));
	}
	

	public void signInButtonClick() {
		// TODO Auto-generated method stub
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mlui02']")));
		
		driver.findElement(signInLinkClick).click();
		
		 
	}
	
	public void registerButtonClick() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mlui01']")));
		
		driver.findElement(registerLinkClick).click();
}
	
	public void freelancerButtonLinkClick()
	{
		
		
		WebElement ele = driver.findElement(freelancerLinkClick);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
}
	
	
	public void BusinessButtonLinkClick() {
		
		WebElement ele = driver.findElement(BusinessLinkclick);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
}
}