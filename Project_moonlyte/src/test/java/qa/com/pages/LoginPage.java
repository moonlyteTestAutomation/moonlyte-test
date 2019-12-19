package qa.com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;


public class LoginPage  extends Baseclass{

	WebDriverWait wait = new WebDriverWait(driver, 20);


	By email;
	By password;
	By proceedButtonClick;
	By passwordSet ;
	By FacebbookButton;
	By facebookUsername;
	By facebookPassword;
	By facebookLoginButton;
	By googleButton;
	By googleEmailId;
	By googleNextButton;
	By googlePassword;
	By googlePasswordNext;
	String parentWindowId;
	String childWindowId;

	public LoginPage() {
		
		//MANUAL LOGIN WEBELEMENTS INTIALIZATION 
		email=By.xpath("//*[@id='emailInput']");
		proceedButtonClick=By.cssSelector("button#mlui14");
		passwordSet=By.xpath("//*[@id=\"password\"]");
		
		
		//FACEBOOK LOGIN WEBELEMENTS INTIALIZATION 
		FacebbookButton=By.xpath("//*[@id='mlui10']");
		facebookUsername=By.xpath("//*[@id='email']");
		facebookPassword=By.xpath("//*[@id='pass']");
		facebookLoginButton = By.cssSelector("input#u_0_0");
		
		//GOOGLE LOGIN WEBELEMENTS INTIALIZATION 
		googleButton =By.xpath("//*[@id='mlui11']");
		googleEmailId=By.xpath("//input[@class='whsOnd zHQkBf']");
		googleNextButton=By.xpath("//*[@id='identifierNext']/span/span");
		googlePassword=By.name("password");
		googlePasswordNext=By.xpath("//*[@id='passwordNext']/span/span");


	}
	
	
	// MANUAL LOGIN
	public void setEmail(String emailId) {


		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='emailInput']"))); 

		driver.findElement(email).sendKeys(emailId);


	}			

	public void clickProceed() {


		
		WebElement ele = driver.findElement(By.cssSelector("button#mlui14"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);


	}

	public void setPassword(String password)

	{


		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));

		driver.findElement(passwordSet).sendKeys(password);

	}

	public void clickSignIn() {
		// TODO Auto-generated method stub

		WebElement ele = driver.findElement(By.cssSelector("button#mlui13"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		

	}


	// facebook Login

	public  void facebookButtonClick()

	{
		driver.findElement(FacebbookButton).click();

		Set<String> handler = driver.getWindowHandles();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Iterator<String> it=handler.iterator();

		parentWindowId=it.next();
		childWindowId=it.next();

		driver.switchTo().window(childWindowId);
		

	}


	public void facebookemailIdEnter(String facebookmailId)
	{
		driver.findElement(facebookUsername).sendKeys(facebookmailId);

	}

	public void facebookPasswordEnter(String facebookPass) {


		driver.findElement(facebookPassword).sendKeys(facebookPass);

	}
	public void facebookLoginButtonclick()
	{

		WebElement ele = driver.findElement(By.cssSelector("input#u_0_0"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		

		driver.switchTo().window(parentWindowId);
		

	}


	
	
	//Google login 
	
	public void googleButtonClick() 
	{
	
		driver.findElement(googleButton).click();
		
		
		Set<String> handler = driver.getWindowHandles();
	

		Iterator<String> it=handler.iterator();

	    parentWindowId=it.next();
		String childWindowId=it.next();

		driver.switchTo().window(childWindowId);
		
	
   }
	

	public void googleemailIdEnter(String googleemailId)
	{
		driver.findElement(googleEmailId).sendKeys(googleemailId);

	}

	public void googlenextButtonClick() 
	{
	
		WebElement ele = driver.findElement(By.xpath("//*[@id='identifierNext']/span/span"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	

	
	public void googlePasswordEnter(String googlePass) {

		
		WebDriverWait some_element = new WebDriverWait(driver,100); 
		some_element.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		driver.findElement(googleEmailId).sendKeys(googlePass);
		//driver.findElement().sendKeys(facebookPass);

	}
	
	

	public void googlePasswordNextClick() {
		// TODO Auto-generated method stub
		WebElement ele = driver.findElement(googlePasswordNext);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		driver.switchTo().window(parentWindowId);
	
	}
	
	
	
	
	

}

