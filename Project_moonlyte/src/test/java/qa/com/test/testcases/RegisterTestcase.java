package qa.com.test.testcases;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.test.scenarios.LoginScenario;
import qa.com.test.scenarios.RegisterScenario;

public class RegisterTestcase extends Baseclass {


	//MANUAL REGISTER TESTCASE	
	
	
@Test
	public static void RegisterManualEmailPasswordcorrect() throws InterruptedException, SQLException, IOException {

		TestData testData = new TestData();
		ArrayList<String> getManualDataList = testData.dataSetUp("ManualRegistrationCredentials","Registration");

		String email = getManualDataList.get(1);
		String pass = getManualDataList.get(2);
		RegisterScenario pageObjReg = new RegisterScenario();
		pageObjReg.manualRegister(email, pass);

		
		
		
		/*
		 * String email = "swathicnbr@gmail.com"; String pass = "swathi@12";
		 */
		

	}


	
	//FACEBOOK REGISTER TESTCASE
	
	@Test
	public static void EmailFacebookRegister() throws IOException, InterruptedException {
		  TestData testData = new TestData();
			ArrayList<String> getFacebookDataList = testData.dataSetUp("FacebookRegistrationCredentials","Registration");

		String facebookmailId =  getFacebookDataList.get(1);
		String facebookPassword=getFacebookDataList.get(2);
		RegisterScenario fbReg = new RegisterScenario();
		fbReg.facebookRegister(facebookmailId, facebookPassword);
	
		
	}
   
   	//GOOGLEREGISTER TESTCASE
   
	
 @Test
	public static void GoogleRegisterTestcase() throws IOException, InterruptedException
	{

		  TestData testData = new TestData();
	     ArrayList<String> getGoogleDataList = testData.dataSetUp("GoogleRegistrationCredentials","Registration");

		String googlemailId =  getGoogleDataList.get(1);
		String googlePassword=getGoogleDataList.get(2);
		RegisterScenario googleRegObj=new RegisterScenario();
		googleRegObj.googleRegister(googlemailId,googlePassword);


	}












}
