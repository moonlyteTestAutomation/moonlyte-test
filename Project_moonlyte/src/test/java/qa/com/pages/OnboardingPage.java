package qa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class OnboardingPage extends Baseclass {
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	By name;
	By proceedButton;
	By skillSelection;
	By proceedButton1;
	By yearOfExperiencetext;
	By proceedButton2;
	By OnboardSucess;
	By onboardComplete;

	
	
	public OnboardingPage()
	{


		name=By.xpath("//input[@type='text']");
		proceedButton=By.xpath("//button[contains(text(),'PROCEED')]");
		//skillSelection=By.xpath("//*[@id='onboard-add-skills']/div[1]/mat-form-field/div/div[1]/div");
		skillSelection=By.id("mat-chip-list-input-2");
		 proceedButton1=By.xpath("//button[@class='btn btn-primary btn-ml pulse']");
		 yearOfExperiencetext=By.cssSelector("input[type='number'");
			proceedButton2=By.xpath("//button[contains(text(),'PROCEED')]");
			OnboardSucess=By.xpath("//button[contains(text(),' YES')]");
			onboardComplete=By.xpath("//button[contains(text(),'PROCEED')]");
			
			
	}
	
	public void setName(String sellerName) {


		//WebDriverWait some_element = new WebDriverWait(driver,200); 
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(name));
		driver.findElement(name).clear();
		
		driver.findElement(name).sendKeys(sellerName);
	
	
		//driver.findElement(name).sendKeys(sellerName + Keys.ARROW_DOWN.ENTER);


	}	
	
public void clickOnboardProceed1()  {


	
		WebElement ele = driver.findElement(proceedButton);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(skillSelection));

	}
	
public  void selectSkill(String skill) throws InterruptedException {
	
    driver.findElement(skillSelection).sendKeys(skill);
    Thread.sleep(2000);
    driver.findElement(skillSelection).sendKeys(Keys.ARROW_DOWN);
    Thread.sleep(2000);
	driver.findElement(skillSelection).sendKeys(Keys.ENTER);

    
	//driver.findElement(skillSelection).sendKeys(skill+ Keys.ARROW_DOWN.ENTER);

}

public void clickOnboardProceed2()  {


	
	WebElement ele = driver.findElement(proceedButton1);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	

}
public void getYearOfExperience(String yearOfExperience) {
	
	 driver.findElement(yearOfExperiencetext).sendKeys(yearOfExperience);

}
public void clickOnboardProceed3()  {


	
	WebElement ele = driver.findElement(proceedButton2);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	

}


public void onboardSucessClick()  {


	
	WebElement ele = driver.findElement(OnboardSucess);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	

}
public void clickOnboardComplete()  {


	
	WebElement ele = driver.findElement(onboardComplete);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	

}

}