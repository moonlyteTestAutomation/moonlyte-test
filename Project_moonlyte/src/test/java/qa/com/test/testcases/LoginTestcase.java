package qa.com.test.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.pages.LaunchPage;
import qa.com.pages.LoginPage;
import qa.com.test.scenarios.LoginScenario;
import qa.com.test.scenarios.RegisterScenario;

public class LoginTestcase extends Baseclass {

	// MANUL LOGIN TESTCASE
	
	

@Test
	public static void LoginManualEmailPasswordcorrect() throws InterruptedException, IOException {

	       LoginManualEmailPasswordOnboard();

	}

	
	
	
	public static void LoginManualEmailPasswordOnboard() throws InterruptedException, IOException {

		TestData testData = new TestData();
		ArrayList<String> getManualDataList = testData.dataSetUp("ManualLoginCredentials","Login");

		String email = getManualDataList.get(1);
		String pass = getManualDataList.get(2);
		LoginScenario pageObjLogin = new LoginScenario();
		pageObjLogin.manualLogin(email, pass);

		// String email = "nambiarankitha50@gmail.com";
		// String pass = "swathi@12";
		// LoginScenario pageObjLogin = new LoginScenario();
		// pageObjLogin.manualLogin(email, pass);

	}

	// FACEBOOK LOGIN TESTCASE

@Test
	public static void EmailFacebookLogin() throws IOException, InterruptedException {

		TestData testData = new TestData();
		ArrayList<String> getFacebookDataList = testData.dataSetUp("FacebookLoginCredentials","Login");

		String email = getFacebookDataList.get(1);
		String pass = getFacebookDataList.get(2);
//		
//		String facebookmailId = "cbheem954@gmail.com";
//		String facebookPassword="Moonlyte@2019";
		LoginScenario fbLogin = new LoginScenario();
		fbLogin.facebookLogin(email, pass);

	}

	// GOOGLE LOGIN TESTCASE


 @Test
	public static void GoogleLoginTestcase() throws IOException, InterruptedException {

	
	  TestData testData = new TestData();
		ArrayList<String> getGoogleDataList = testData.dataSetUp("GoogleLoginCredentials","Login");

	String googlemailId =  getGoogleDataList.get(1);
	String googlePassword=getGoogleDataList.get(2);
	LoginScenario googleLoginObj=new LoginScenario();
	googleLoginObj.googleLogin(googlemailId, googlePassword);
//	RegisterScenario fbReg = new RegisterScenario();
//	fbReg.facebookRegister(googlemailId ,googlePassword);
	 
	 
 }

 public static void GoogleLoginBuyerRegistration() throws IOException, InterruptedException {

		
	  TestData testData = new TestData();
		ArrayList<String> getGoogleDataList = testData.dataSetUp("GoogleLoginCredentials","Login");

	String googlemailId =  getGoogleDataList.get(1);
	String googlePassword=getGoogleDataList.get(2);
	LoginScenario googleLoginObj=new LoginScenario();
	googleLoginObj.googleLogin(googlemailId, googlePassword);
//	RegisterScenario fbReg = new RegisterScenario();
//	fbReg.facebookRegister(googlemailId ,googlePassword);
	 
	 
}	 
	 
	 
	 
	 
	 
	 
	 
	 
		/*
		 * TestData testData = new TestData(); ArrayList<String> getGoogleDataList =
		 * testData.dataSetUp("GoogleLoginCredentials","Login");
		 * 
		 * String googlemailId = getGoogleDataList.get(1); String googlePassword =
		 * getGoogleDataList.get(2);
		 * 
		 * 
		 * //String googlemailId = "swathi.c@moonlyte.com"; //String googlePassword =
		 * "swathi@12"; LoginScenario googleLoginObj = new LoginScenario();
		 * googleLoginObj.googleLogin(googlemailId, googlePassword);
		 */

	

}
