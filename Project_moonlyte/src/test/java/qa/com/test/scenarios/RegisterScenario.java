package qa.com.test.scenarios;

import java.sql.SQLException;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.LoginPage;
import qa.com.pages.RegistrationPage;

public class RegisterScenario  extends Baseclass{

	RegistrationPage regPageObj= new RegistrationPage();
	LaunchPage pageObjLogin = new LaunchPage();

	
	
	
	//MANUAL REGISTER SCENARIOS 
	
	public void manualRegister(String email, String pass) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
 
	
		pageObjLogin.registerButtonClick();
		Thread.sleep(2000);
		regPageObj.setEmail(email);
		Thread.sleep(2000);
		regPageObj.clickcreateAccount(email);
		Thread.sleep(4000);
		//regPageObj.clickRegisterOkPopoup();
		regPageObj.createPassword(pass);
		Thread.sleep(2000);
		regPageObj.createPasswordProceedButtonClick();
		Thread.sleep(3000);
		
	}
	
	
	
	
	//FACEBOOK REGISTER SCENARIOS
	
	public void facebookRegister(String facebookmailId , String facebookPassword) throws InterruptedException {
		// TODO Auto-generated method stub
	
		pageObjLogin.registerButtonClick();
		Thread.sleep(3000);
		regPageObj.facebookButtonClick();
		Thread.sleep(3000);
		regPageObj.facebookemailIdEnter(facebookmailId);
		Thread.sleep(3000);
		regPageObj.facebookPasswordEnter(facebookPassword);
		Thread.sleep(3000);
		regPageObj.facebookLoginButtonclick();
		


	}
	
	
	//GOOGLE REGISTER SCENARIOS
	
	public void googleRegister(String googlemailId, String googlePassword  ) throws InterruptedException

	{
	
		pageObjLogin.registerButtonClick();
		Thread.sleep(3000);
		regPageObj.googleButtonClick();
		Thread.sleep(3000);
		regPageObj.googleemailIdEnter(googlemailId );
		Thread.sleep(6000);
		regPageObj.googlenextButtonClick();
		Thread.sleep(6000);
		regPageObj.googlePasswordEnter(googlePassword);
		Thread.sleep(6000);
		regPageObj.googlePasswordNextClick();
		Thread.sleep(6000);
	
		
	}



	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
