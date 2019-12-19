package qa.com.test.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import qa.com.baseclass.Baseclass;
import qa.com.test.scenarios.LoginScenario;
import qa.com.test.scenarios.OnboardingScenario;

public class SellerOnboardingTestcase  extends Baseclass{

	
	
	@Test
	
	public static void sellerOnboardingUsingDataBaseskill() throws InterruptedException, IOException {

		
	    LoginTestcase.LoginManualEmailPasswordOnboard();
	    Thread.sleep(10000);
		TestData testData = new TestData();
		ArrayList<String> getOnboardDataList = testData.dataSetUp("SellerOnboardingUsingDatabaseSkill","SellerOnboarding");

		String sellerName = getOnboardDataList.get(1);
		String skill = getOnboardDataList.get(2);
		String yearOfExperience = getOnboardDataList.get(3);
		OnboardingScenario pageObjOnboard = new OnboardingScenario();
		 pageObjOnboard.sellerOnboarding(sellerName , skill, yearOfExperience);
		

		
		/*
		 * String sellerName = "swathi"; String skill = "java";
		 * LoginTestcase.LoginManualEmailPasswordOnboard(); Thread.sleep(10000);
		 * 
		 * OnboardingScenario pageObjOnboard = new OnboardingScenario();
		 * pageObjOnboard.sellerOnboarding(sellerName , skill);
		 */

	}
}
