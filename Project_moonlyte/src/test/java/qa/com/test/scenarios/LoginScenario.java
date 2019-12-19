package qa.com.test.scenarios;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.LoginPage;

public class LoginScenario extends Baseclass {

	LoginPage moonlyteloginPage = new LoginPage();
	LaunchPage pageObjLogin = new LaunchPage();

//MANUAL LOGIN SCENARIOS
	public void manualLogin(String email, String pass) throws InterruptedException {


		pageObjLogin.signInButtonClick();
		Thread.sleep(3000);
		moonlyteloginPage.setEmail(email);
		Thread.sleep(3000);
		moonlyteloginPage.clickProceed();
		Thread.sleep(3000);
		moonlyteloginPage.setPassword(pass);
		Thread.sleep(3000);
		moonlyteloginPage.clickSignIn();

	}
	
	// FACEBOOK LOGIN SCENARIOS
	
	public void facebookLogin(String facebookmailId , String facebookPassword ) throws InterruptedException {
		// TODO Auto-generated method stub

		pageObjLogin.signInButtonClick();
		Thread.sleep(3000);
		moonlyteloginPage.facebookButtonClick();
		Thread.sleep(3000);
		moonlyteloginPage.facebookemailIdEnter(facebookmailId);
		Thread.sleep(3000);
		moonlyteloginPage.facebookPasswordEnter(facebookPassword);
		Thread.sleep(3000);
		moonlyteloginPage.facebookLoginButtonclick();
		
	}

	
	
	//GOOGLE LOGIN SCENARIOS
    public void googleLogin(String googlemailId ,String googlePassword ) throws InterruptedException
 
{

	pageObjLogin.signInButtonClick();
	Thread.sleep(3000);
	moonlyteloginPage.googleButtonClick();
	Thread.sleep(3000);
	moonlyteloginPage.googleemailIdEnter(googlemailId );
	Thread.sleep(3000);
	moonlyteloginPage.googlenextButtonClick();
	Thread.sleep(3000);
	moonlyteloginPage.googlePasswordEnter(googlePassword);
	Thread.sleep(3000);
	moonlyteloginPage.googlePasswordNextClick();
	
	
		
	
}




	
	



	
	}
