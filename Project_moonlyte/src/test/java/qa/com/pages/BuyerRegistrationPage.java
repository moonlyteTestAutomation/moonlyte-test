package qa.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.com.baseclass.Baseclass;

public class BuyerRegistrationPage extends Baseclass{

	WebDriverWait wait = new WebDriverWait(driver, 20);
	By buyerName;
	By sellerNameText;
	//By buyerCardEnterButton;
	
	public BuyerRegistrationPage()
	{


		buyerName=By.xpath("//*[@id='company']");
		sellerNameText=By.xpath("//*[@id='name']");
		//buyerCardEnterButton=By.xpath("//button[contains(text(),'ENTER')]");
		
		
	}
		public void setCompanyName(String companyName) {


			WebDriverWait some_element = new WebDriverWait(driver,100); 
			some_element.until(ExpectedConditions.visibilityOfElementLocated(buyerName)); 

			driver.findElement(buyerName).sendKeys(companyName);


		}	
	
	/*
	 * public void setSellerName(String sellerName) {
	 * 
	 * 
	 * WebDriverWait some_element = new WebDriverWait(driver,100);
	 * 
	 * some_element.until(ExpectedConditions.visibilityOfElementLocated(
	 * sellerNameText));
	 * 
	 * driver.findElement(sellerNameText).sendKeys(sellerName);
	 * 
	 * }
	 */
		
		public void clickProceed() {
			// TODO Auto-generated method stub
			WebDriverWait some_element = new WebDriverWait(driver,100); 
			WebElement ele = driver.findElement(By.cssSelector("button#mlui16"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			

		}
	/*
	 * public void buyerCardEnterButtonClick() {
	 * 
	 * //WebDriverWait some_element = new WebDriverWait(driver,100); WebDriverWait
	 * wait = new WebDriverWait(driver, 100);// 1 minute
	 * 
	 * 
	 * WebElement ele = driver.findElement(buyerCardEnterButton); JavascriptExecutor
	 * executor = (JavascriptExecutor)driver;
	 * executor.executeScript("arguments[0].click();", ele);
	 * wait.until(ExpectedConditions.elementToBeClickable(buyerCardEnterButton));
	 * 
	 * }
	 */
}
