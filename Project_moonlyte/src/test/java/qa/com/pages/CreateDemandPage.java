package qa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class CreateDemandPage extends Baseclass{
	WebDriverWait wait = new WebDriverWait(driver, 20);	

	By hambugerCreateProject;
	By projectTitletext;
	By projectCompensation;
	By  projectDescription;
	
					
			
	
	public CreateDemandPage()
	{


	
		hambugerCreateProject=By.xpath("//span[contains(text(),'New Projects')]");
        
		projectTitletext=By.cssSelector("input.form-control ng-pristine ng-invalid ng-touched");
		
		
		
	}

	
	public void hamburgerCreateProjectClick()
	{

		WebElement ele = driver.findElement(hambugerCreateProject);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		
	}
	
	public void getProjectTitle(String projectTitle) throws InterruptedException
	{
	

		driver.findElement(projectTitletext).sendKeys(projectTitle);
	Thread.sleep(3000);
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	

